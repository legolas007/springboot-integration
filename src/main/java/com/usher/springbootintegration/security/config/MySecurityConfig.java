package com.usher.springbootintegration.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Author: Usher
 * @Description:
 */
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        //定制请求授权规则
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2")
                .antMatchers("/level3/**").hasRole("VIP3");

        //开启自动配置的登录功能，没权限来到这里
        http.formLogin().usernameParameter("user").passwordParameter("pwd").loginPage("/userlogin");

        //注销，清空session
        http.logout().logoutSuccessUrl("/");//注销成功回到首页

        //开启记住我功能
        http.rememberMe().rememberMeParameter("remember");
        //登录成功后浏览器保存cookie，以后登录带上这个cookie，只要通过检查就可以免登录

    }

    //定义认证规则

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth);
        auth.inMemoryAuthentication()
                .withUser("usher").password("123456").roles("VIP1","VIP2")
                .and()
                .withUser("Lisa").password("123456").roles("VIP2","VIP3")
                .and()
                .withUser("Jhon").password("123465").roles("VIP1","VIP3");
    }
}
