package com.yyx.aio.service.impl;

import com.yyx.aio.common.pageInfo.PageInfo;
import com.yyx.aio.entity.Post;
import com.yyx.aio.mapper.PostMapper;
import com.yyx.aio.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuwei
 * @time 2017 11 30
 */
@Service("postService")
public class PostServiceImpl implements PostService{

    @Autowired(required = false)
    private PostMapper postMapper;

    @Override
    public List<Post> getPostListByInfo(Post post, PageInfo pageInfo) {
        return postMapper.selectPostListByInfo(post,pageInfo);
    }

    @Override
    public int deletePost(List<Post> list) {
        int deleteCount =0;
        for (Post e:list) {
            deleteCount+=postMapper.deleteByPrimaryKey(e.getId());
        }
        return deleteCount;
    }

    @Override
    public int sendBackPost(List<Post> list) {
        int sendBackCount =0;
        for (Post e:list) {
            sendBackCount+=postMapper.updateByPrimaryKey(e);
        }
        return sendBackCount;
    }
}
