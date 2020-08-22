package com.example.demo.Jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Component;

import java.util.Date;

import java.util.function.Function;

@Component
public class Util {

    private static final String Key = "411657C24D2986D9EE41AFCF2722F394";


    public Claims checkToken(String token) {
        Claims claims = null;
        try {
            claims = Jwts.parser().setSigningKey(Key).parseClaimsJws(token).getBody();

        } catch (Exception e) {
            throw new BadCredentialsException("Invalid token");
        }

        return claims;
    }

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
        final Claims claims = checkToken(token);
        return claimsResolver.apply(claims);
    }

}
