package com.example.demo.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.uss.domain.User;

public interface ArticleRepo extends JpaRepository<User,Long>{

}
