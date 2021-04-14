package com.example.api.files;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
public class FileDto {
    private long fileId;
    private String saveFname;
    private String originFname;
    private long fsize;
}
