package com.example.demo.sec.domain;

public interface AuthenticationProvider {
    
	// 인증 전의 Authenticaion 객체를 받아서 인증된 Authentication 객체를 반환
    // Authentication authenticate(Authentication var1) throws AuthenticationException;

    boolean supports(Class<?> var1);
    
}