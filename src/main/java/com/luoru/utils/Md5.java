package com.luoru.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 *  @author: Luoru
 *  @Date: 2019/12/24 23:37
 *  @Description: Md5密码加密工具类
 */
public class Md5 {
    public static String toMd5(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte[] bytes = md.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(bytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
