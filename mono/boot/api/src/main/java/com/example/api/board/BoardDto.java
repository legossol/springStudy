package com.example.api.board;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class BoardDto {
    private long boardId;
    private String writer;
}
