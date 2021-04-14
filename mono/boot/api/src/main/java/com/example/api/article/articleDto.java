package com.example.api.article;

import lombok.Data;

@Data
public class articleDto {
    private long articleId;
    private String writer;
    private String email;
    private String subject;
    private String content;
    private String rdate;
}
