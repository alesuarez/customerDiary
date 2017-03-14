package com.swr.customerDiary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/")
@Controller
public class TestController {


    @ResponseBody
    @RequestMapping(value = "/testController/hola", method = RequestMethod.GET)
    String home() {
        return "Hello World!";
    }

    @ResponseBody
    String work() {
        return "Hello World!";
    }
}
