package com.example.api.article;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class ArticleDto {
    private long articleId;
    private String writer;
    private String email;
    private String subject;
    private String content;
    private String rdate;
    
    public void setWriter(String email){
        this.email  = email;
    }
    public String getWriter(){
        return this.email;
    }
    public String toString(){
        return "email: " + this.email+ "writer: "+this.writer;
    }
}
