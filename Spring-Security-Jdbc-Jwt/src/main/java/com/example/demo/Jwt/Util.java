package com.example.demo.Jwt;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Component;

import com.example.demo.Dao.Userdao;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class Util {

	private static final String Key = "411657C24D2986D9EE41AFCF2722F394";
	private static final String Issuer = "ADMIN";
	private static final String Subject = "USERTOKEN";
	private static final String SESS_EMAIL = "SESS_USERNAME";

	@Autowired
	public Userdao userdao;

	public String createToken(String username) {
		String token=null;
		Map<String, Object> map = new HashMap<>();
		map.put(SESS_EMAIL, username);

		SignatureAlgorithm algo = SignatureAlgorithm.HS256;

		 token = Jwts.builder().setIssuer(Issuer).setClaims(map).setSubject(Subject)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 3600 * 24)).signWith(algo, Key).compact();
	
		 token = "Bearer "+token;
		 return token;
	}

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
