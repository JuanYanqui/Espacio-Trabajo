package ista.Backed20.api.security;

import java.util.Date;

import ista.Backed20.api.entity.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenUtil {
    private static final long EXPIRE_DURATION = 24 * 60 * 60 * 1000; // 24 hour


    private String SECRET_KEY= "secret";

    public String generateAccessToken(Usuario usuario) {
        return Jwts.builder()
                .setSubject(String.format("%s,%s", usuario.getId_usuario(), usuario.getUsername()))
                .setIssuer("CodeJava")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_DURATION))
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();

    }
}
