package com.example.userservice.demo.Controller;

import com.example.userservice.demo.Jwt.Util;
import com.example.userservice.demo.Model.Login;
import com.example.userservice.demo.Model.Myuser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@RestController
public class Controller {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private JdbcUserDetailsManager jdbcUserDetailsManager;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private Util util;

    @PostMapping("/Register")
    public String register(@RequestBody Myuser myuser) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(myuser.getRole()));
        String encodededPassword = passwordEncoder.encode(myuser.getPassword());
        User user = new User(myuser.getUserName(), encodededPassword, authorities);
        jdbcUserDetailsManager.createUser(user);

        return "User created";
    }


    @PostMapping("/Login")
    public String UserLogin(@RequestBody Login login) {

        String token = null;

        Authentication details;
        try {
            details = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(login.getUsername(), login.getPassword()));

            token = util.createToken(login.getUsername());
            System.out.println(token);

        } catch (Exception e) {
            throw new BadCredentialsException("Bad credentials");
        }
        return token;
    }

    @GetMapping("/")
    public String home() {
        return ("<h1>home</h1>");
    }

    @GetMapping("/User")
    public String User(@RequestHeader(name = "Authentication") String token) {
        System.out.println(token);
        return ("<h1>"+token+"</h1>");
    }

    @GetMapping("/Admin")
    public String Admin() {
        return ("<h1>Admin</h1>");
    }

}
