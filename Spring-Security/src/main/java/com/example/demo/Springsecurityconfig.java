package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class Springsecurityconfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.inMemoryAuthentication()
		.withUser("user").password("{noop}password").roles("User")
			.and()
			.withUser("admin").password("{noop}password").roles("User", "Admin")
				.and()
				.withUser("manager").password("{noop}password").roles("User", "Admin", "Manager");
		
		
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
        
        .httpBasic()
        .and()
        .authorizeRequests()
		.antMatchers(HttpMethod.GET, "/books/**").hasRole("User")
		.antMatchers(HttpMethod.POST, "/books/**").hasRole("Admin")
		.antMatchers(HttpMethod.PUT, "/books/**").hasRole("User")
		.antMatchers(HttpMethod.DELETE, "/books/**").hasRole("User")
		.antMatchers(HttpMethod.PATCH, "/books/**").hasRole("Admin")
		.and()
        .csrf().disable()
        .formLogin().disable();
	}
	
	
	
	
	
	

}
