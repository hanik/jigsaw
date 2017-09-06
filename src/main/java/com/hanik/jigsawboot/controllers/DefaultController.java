package com.hanik.jigsawboot.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/")
@CrossOrigin(origins = "*")
@RestController
public class DefaultController {

    @GetMapping (value="/test")
    public List<String> getTestData() {
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i<100 ; i++) {
            String string = i + "th TestData";
            list.add(string);
        }
        return list;
    }
}