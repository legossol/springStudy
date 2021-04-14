package com.example.api;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
	//scriptlet이 보낸 것을 받아들이는 servlet
	//servlet만이 존재하는 이유  = 보안을 위해
	// 객체의 공간 = instance 

	//이 자바가 돌면 serlet객체(instance)가 만들어진다.
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApiApplication.class);
	}

}
