package com.example.demo.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.demo.Dao.Userdao;
import com.example.demo.Jwt.Util;
import com.example.demo.Model.Users;

import io.jsonwebtoken.Claims;


@Component
public class jwtfilter extends OncePerRequestFilter {
	
	@Autowired
	private Util util;
	
	@Autowired
	private Userdao userdao;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		final String authheader = request.getHeader("Authentication");
		String jwttoken = null;
		
		if (authheader!=null && authheader.startsWith("Bearer")) {
			jwttoken = authheader.substring(7);
		}
		
		
		try {
			
			if(util.checkToken(jwttoken)!=null && SecurityContextHolder.getContext().getAuthentication() == null) {
				Claims claims = util.checkToken(jwttoken);
				System.out.println(claims);
				Users users = userdao.findByUsername(claims.get("SESS_USERNAME").toString());
				System.out.println(users);
				
				if(!util.isTokenExpired(jwttoken)) {
					List<GrantedAuthority> authorities = new ArrayList<>();
                    authorities.add(new SimpleGrantedAuthority(users.getAuthorities().getAuthority()));
                    UserDetails userDetails = new User(users.getUsername(), users.getPassword(), authorities);
                    System.out.println(userDetails);
                    UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new
                            UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    
                    usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
				
				}
			}
		}
		catch (Exception e) {
			SecurityContextHolder.clearContext();
		}
	filterChain.doFilter(request, response);
	}
	
	
	

}
