package com.kodilla.kodillaconverter.controller;

import com.kodilla.kodillaconverter.domain.MyDomainClass;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom/")
public class CustomController {
    @PostMapping(path = "add")
    public void acceptCustomText(@RequestBody MyDomainClass myDomainClass){
        System.out.println(myDomainClass.getParameterX());
        System.out.println(myDomainClass.getParameterY());
    }
}
