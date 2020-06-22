package com.zy.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
    @RequestMapping("/get-info")
    @ResponseBody
    public String getInfo(){
        return "info";
    }
}
