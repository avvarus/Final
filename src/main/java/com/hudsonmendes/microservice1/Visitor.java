package com.hudsonmendes.microservice1;

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

    @RequestMapping(path = "/third")
    public String greeting3() {

        return "Hello babyy !!!";
    }

    @RequestMapping(path = "/fourth")
    public String greeting4() {

        return "Hello babyy !!!";
    }

    @RequestMapping(path = "/second")
    public String second() {

        return "Hello babyy second!!!";
    }

}