package com.hudsonmendes.microservice1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Visitor {


    @RequestMapping(path = "/first")
    public String greeting() {

        return "Hello babyy !!!";
    }

}