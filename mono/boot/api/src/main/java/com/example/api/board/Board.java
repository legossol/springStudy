package com.example.api.board;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Board {
    @Id
    @Column(name = "board_id") private long boardId;
    @Column(name = "title") private String title;
    @Column(name = "writer") private String writer;
    
}
