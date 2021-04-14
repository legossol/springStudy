package com.example.api.files;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

@Entity @Table(name = "files")
public class fileVo {
    @Id
    @Column(name = "file_id")
    private long fileId;
    @Column(name = "save_fname")
    private String saveFname;
    @Column(name = "origin_fname")
    private String originFname;
    @Column(name = "fsize")
    private long fsize;
    
}
