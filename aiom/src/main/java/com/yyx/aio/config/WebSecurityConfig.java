package com.yyx.aio.config;


import com.yyx.aio.common.MD5Util;
import com.yyx.aio.config.filter.CorsFilter;
import com.yyx.aio.config.filter.GenerateTokenForUserFilter;
import com.yyx.aio.config.filter.VerifyTokenFilter;
import com.yyx.aio.config.handler.EntryPointUnauthorizedHandler;
import com.yyx.aio.config.handler.MyAccessDeniedHandler;
import com.yyx.aio.config.identity.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


/**
 * <Description> <br>
 *
 * @author henley<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年1月13日 <br>
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    SessionRegistry sessionRegistry;
    @Autowired
    private TokenUtil tokenUtil;
    /**
     * 注册 401 处理器
     */
    @Autowired
    private EntryPointUnauthorizedHandler unauthorizedHandler;

    /**
     * 注册 403 处理器
     */
    @Autowired
    private MyAccessDeniedHandler accessDeniedHandler;



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin().loginPage("/login").usernameParameter("username").passwordParameter("password").successForwardUrl("/users")
                .and()
                .addFilterBefore(new CorsFilter(), ChannelProcessingFilter.class)
                .addFilterBefore(new VerifyTokenFilter(tokenUtil), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(new GenerateTokenForUserFilter("/login", authenticationManager(), tokenUtil), UsernamePasswordAuthenticationFilter.class)
                .authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/logout").permitAll()
                .antMatchers("/swagger-ui.html").permitAll()
                .antMatchers("/loginError").permitAll()
                /*静态资源*/
                .antMatchers("/images/**").permitAll()
                .antMatchers("/js/**").permitAll()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/fonts/**").permitAll()
                .antMatchers("/favicon.ico").permitAll()
                .antMatchers("/webjars/**").permitAll()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .exceptionHandling().authenticationEntryPoint(this.unauthorizedHandler).accessDeniedHandler(this.accessDeniedHandler)
                .and()
                .logout()
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .and()
                .httpBasic();
        http.csrf().disable();
    }
    /*exceptionHandling().authenticationEntryPoint(this.unauthorizedHandler).accessDeniedHandler(this.accessDeniedHandler)
    .and()
    .anonymous().and()
    .csrf().disable()
    .addFilterBefore(new CorsFilter(), ChannelProcessingFilter.class)
    .addFilterBefore(new VerifyTokenFilter(tokenUtil), UsernamePasswordAuthenticationFilter.class)
    .addFilterBefore(new GenerateTokenForUserFilter("/users", authenticationManager(), tokenUtil), UsernamePasswordAuthenticationFilter.class)
    .authorizeRequests()
    .anyRequest().fullyAuthenticated()
    .and().formLogin().successForwardUrl("/users").and()
    .logout()
    .invalidateHttpSession(true)
    .clearAuthentication(true)
    .and()
    .httpBasic();*/

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setHideUserNotFoundExceptions(false);
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(new PasswordEncoder() {

            @Override
            public String encode(CharSequence rawPassword) {
                return MD5Util.encode((String) rawPassword);
            }

            /**
             * rawPassword 是登录密码
             * encodedPassword 数据库密码
             * */
            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                return encodedPassword.equals(encode(rawPassword));
            }
        });
        return provider;
    }

    @Bean
    public SessionRegistry getSessionRegistry() {
        SessionRegistry sessionRegistry = new SessionRegistryImpl();
        return sessionRegistry;
    }
}