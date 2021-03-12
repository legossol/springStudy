package com.example.demo.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.article.domain.Article;

public interface ArticleRepo extends JpaRepository<Article,Long>{

}
