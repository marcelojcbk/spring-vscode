package com.marcelo.springvscode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping(value="/")
    public String getMethodName(){
        return "Olá mundo do VsCode";
    }

}
