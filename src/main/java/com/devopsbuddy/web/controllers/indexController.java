package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Apache on 2017.12.27..
 */

@Controller
public class indexController  {

    @RequestMapping("/")
    public String home(){

        return "index";

    }

}
