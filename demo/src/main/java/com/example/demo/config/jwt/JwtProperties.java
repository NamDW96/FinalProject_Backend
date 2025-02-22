package com.example.demo.config.jwt;

import java.util.Base64;

public interface JwtProperties {
    String SECRET = "서버에기록된비밀번호"; // 서버만 알고 있는 비밀값

    int ACCESS_EXPIRATION_TIME = 60 * 60 * 1000; // 1시간
    int REFRESH_EXPIRATION_TIME = 14 * 24 * 60 * 60 * 1000; // 2주
    String TOKEN_PREFIX = "Bearer "; //USERNAME과 USERID 정보만 가짐
    String HEADER_STRING = "Authorization"; //

    public static byte[] getSecretKey() {
        try {
            //Base64객체로 데이터 암호화함
            return Base64.getEncoder().encode(SECRET.getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
