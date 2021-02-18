//package com.sjq.exercise.eureka.server;
//
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configurable
//@EnableWebSecurity
//public class SpringBootSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // 关闭csrf
//        http.csrf().disable();
//        // 支持httpBasic
//        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
//    }
//
//}