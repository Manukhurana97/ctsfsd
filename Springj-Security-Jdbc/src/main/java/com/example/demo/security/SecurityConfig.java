package com.example.demo.security;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private static final String User = "USER";
	private static final String Admin = "ADMIN";

	@Autowired
	private DataSource datasource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.jdbcAuthentication().dataSource(datasource)
		.passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests()
				.antMatchers("/User").hasAnyRole(User, Admin)
				.antMatchers("/Admin").hasRole(Admin)
				.antMatchers("/", "/Register").permitAll()
				.and().csrf().disable().formLogin();

	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	
//	@Bean
//	public PasswordEncoder getpasswordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	@Bean
	public JdbcUserDetailsManager jdbcUserDetailsManager() {
		return new JdbcUserDetailsManager(datasource);
	}
	
}
