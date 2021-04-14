package com.example.api.files;

import lombok.Data;

@Data
public class fileDto {
    private long fileId;
    private String saveFname;
    private String originFname;
    private long fsize;
}
