package com.yyx.aio.security;

import com.yyx.aio.common.StringUtil;
import com.yyx.aio.entity.Permission;
import com.yyx.aio.entity.User;
import com.yyx.aio.service.PermissionService;
import com.yyx.aio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangkai on 17/2/7.
 */
@Service
public class UrlUserService implements UserDetailsService {
    @Autowired
    UserService userService;
    @Autowired
    PermissionService permissionService;
    @Override
    public UserDetails loadUserByUsername(String userName) { //重写loadUserByUsername 方法获得 userdetails 类型用户
        if (!StringUtil.isNotEmpty(userName)){
            throw new UsernameNotFoundException("用户名不能为空！");
        }
        User user = userService.getByLoginName(userName);
        if (user != null) {
            List<Permission> permissions = permissionService.getByUserId(user.getId());
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            UrlGrantedAuthority urlGrantedAuthority = new UrlGrantedAuthority("/users","ALL");
            grantedAuthorities.add(urlGrantedAuthority);
            if(StringUtil.isNotNull(permissions)){
                for (Permission permission : permissions) {
                    if (permission != null && permission.getName()!=null) {
                        GrantedAuthority grantedAuthority = new UrlGrantedAuthority(permission.getPermissionUrl(),permission.getMethod());
                        grantedAuthorities.add(grantedAuthority);
                    }
                }
            }
            user.setGrantedAuthorities(grantedAuthorities);
            System.out.println("权限加载成功");
            return user;
        } else {
            throw new UsernameNotFoundException("用户名不存在！");
        }
    }
}