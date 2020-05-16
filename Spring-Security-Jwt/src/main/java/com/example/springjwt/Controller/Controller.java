package com.example.springjwt.Controller;


import com.example.springjwt.Jwt.Util;
import com.example.springjwt.Model.Login;
import com.example.springjwt.Model.UserSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {


    @Autowired
    private JdbcUserDetailsManager jdbcUserDetailsManager;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private Util util;

    @PostMapping("/UserRegistration")
    public UserSecurity add(@RequestBody UserSecurity userSecurity) {

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(userSecurity.getRoles()));

        String encodededpassword = passwordEncoder.encode(userSecurity.getPassword());

        User user = new User(userSecurity.getUsername(), encodededpassword, authorities);
        jdbcUserDetailsManager.createUser(user);
        return userSecurity;

    }

    @PostMapping("/Login")
    public String login(@RequestBody Login authenticationdata) throws Exception {
        String token = null;
        org.springframework.security.core.Authentication Logindetails;
        try {
            Logindetails = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationdata.getUsername(), authenticationdata.getPassword())
            );

            String encodededpassword = passwordEncoder.encode(authenticationdata.getPassword());
            System.out.println(encodededpassword);

            token = util.createToken(authenticationdata.getUsername(), encodededpassword);
            System.out.println("login");
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password, " + e);
        }

        return "Token: " + token;
    }

    @GetMapping(value = "/admin")
    public String admin() {
        return "<h3>Welcome Admin :)</h3>";
    }

    @GetMapping(value = "/user")
    public String user() {
        return "<h3>Hello User :)</h3>";
    }

    @GetMapping(value = "/")
    public String welcome() {
        return "<h3>Welcome :)</h3>";
    }

}
