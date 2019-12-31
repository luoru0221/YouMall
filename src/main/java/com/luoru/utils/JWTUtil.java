package com.luoru.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.xml.bind.DatatypeConverter;
import java.util.Date;

/**
 *  @author: Luoru
 *  @Date: 2019/12/31 14:51
 *  @Description: JWT权限控制工具
 */
public class JWTUtil {

    //token秘钥
    private static String base64Secret  = "JDLIAWJELIJAWLIDJIALJKHCKUASHLKJHDASLKJHKJH";

    //创建token字符串
    public static String creatJwt(String user_phone, String user_password) {
        //签名算法，选择SHA-256
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        //当前系统时间
        long now = System.currentTimeMillis();
        //设置过期时间为5分钟
        long exp = now + 1000 * 60 * 20;

        JwtBuilder builder= Jwts.builder().setHeaderParam("typ", "JWT")
                .claim("user_id", user_phone)
                .claim("user_password", user_password)
                .setIssuedAt(new Date())
                .signWith(signatureAlgorithm, base64Secret )
                .setExpiration(new Date(exp));//设置过期时间

        return builder.compact();
    }


    //解析字符串token
    public static Claims parseJwt(String token) {
        // System.out.println(token);
        token = token.substring(1, token.length() - 1);
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(base64Secret ))
                    .parseClaimsJws(token).getBody();
            return claims;
        } catch (Exception ex) {
            return null;
        }
    }
}

