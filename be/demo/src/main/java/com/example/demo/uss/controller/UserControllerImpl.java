package com.example.demo.uss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.uss.domain.UserDto;

@Controller
public class UserControllerImpl implements UserController{
	@Autowired UserDto user;
	
	public void test() {
		user.getUserNo();
		user.getUserid();
		user.getEmail();
		user.getUsername();
	}
}
