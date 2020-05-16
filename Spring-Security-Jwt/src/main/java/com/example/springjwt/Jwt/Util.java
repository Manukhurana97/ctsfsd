package com.example.springjwt.Jwt;

import com.example.springjwt.Dao.Userdao;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.function.Function;

@Component
public class Util {

    private final static String Key = "axWDVrgnYJil";
    private final static String ISSUER = "ADMIN";
    private final static String SUBJECT = "USER";
    private final static String SESS_EMAIL = "SESSION_EMAIL";
    private final static String SESS_PASS = "SESSION_PASS";

    @Autowired
    public Userdao userdao;


    public String createToken(String sess_email, String sess_pass)
    {
        Map<String, Object> map = new HashMap<>();
        map.put(SESS_EMAIL, sess_email);
        map.put(SESS_PASS, sess_pass);


        SignatureAlgorithm algo = SignatureAlgorithm.HS256;

        return Jwts.builder().setIssuer(ISSUER).setClaims(map).setSubject(SUBJECT)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+ 1000*60*60*24))
                .signWith(algo, Key).compact();
    }


    public Claims checkToken(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser().setSigningKey(Key).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            System.out.println("no user found");
        }
        return claims;
    }

    //    Check Expiration date
    public boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    private Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = Jwts.parser().setSigningKey(Key).parseClaimsJws(token).getBody();
        return claimsResolver.apply(claims);
    }

    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parser().setSigningKey(Key).parseClaimsJws(token).getBody();
    }



}
