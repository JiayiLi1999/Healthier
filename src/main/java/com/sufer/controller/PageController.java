package com.sufer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author danger
 * @date 2020/6/1 - 14:30
 */
@RestController
public class PageController {

    @RequestMapping("/index")
    public String index(){
        return "hello";
    }

}
