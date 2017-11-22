package com.internal.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Visitor {


    @RequestMapping(path = "/first")
    public String greeting1() {

        return "Hello babyy !!!";
    }

    @RequestMapping(path = "/second")
    public String greeting2() {

        return "Hello babyy !!!";
    }

}