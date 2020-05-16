package com.example.springjwt.Security;

import com.example.springjwt.Dao.Userdao;
import com.example.springjwt.Jwt.Util;
import com.example.springjwt.Model.Users;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Component
public class SecurityJwtFilter extends OncePerRequestFilter {

    @Autowired
    private Util util;

    @Autowired
    private Userdao userdao;

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                    FilterChain filterChain) throws ServletException, IOException {

        final String authheader = httpServletRequest.getHeader("Authentication");
        String jwttoken = null;

        if(authheader!=null && authheader.startsWith("Bearer")) {
            jwttoken = authheader.substring(7);
        }


        if(util.checkToken(jwttoken)!=null && SecurityContextHolder.getContext().getAuthentication() == null) {
            Claims claims = util.checkToken(jwttoken);
            Users users = userdao.findByUsername(claims.get("SESSION_EMAIL").toString());

            if (!util.isTokenExpired(jwttoken)) {
                List<GrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority(users.getAuthorities().getAuthority()));
                UserDetails userDetails = new User(users.getUsername(), users.getPassword(), authorities);

                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new
                        UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());

                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
