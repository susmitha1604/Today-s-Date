package com.example.date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {

    @GetMapping("/")
    public String getdate() {
        LocalDate now = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String strDate = now.format(format1);

        return strDate;
    }
}
