package com.example.resourceserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // 设置/login无需权限访问
                .antMatchers("/login").permitAll()
                // 设置/callback无需权限访问
                .antMatchers("/callback").permitAll()
                .antMatchers("/callback02").permitAll()
                .antMatchers("/client-login").permitAll()
                // 设置其他请求，需要认证后访问
                .anyRequest().authenticated();
    }
}
