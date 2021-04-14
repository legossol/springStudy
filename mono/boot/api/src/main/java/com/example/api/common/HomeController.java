package com.example.api.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String home(){
        return new SimpleDateFormat("yyyy/mm/dd HH:mm:ss").format(new Date());
        //아래와 같음
    // SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    // Date time = new Date();

    // String time1 = format1.format(time);

    // System.out.println(time1);
    // return time1;
    }
}
