package com.example.demo.uss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.uss.domain.User;


public interface UserRepo extends JpaRepository<User,Long>{

}
