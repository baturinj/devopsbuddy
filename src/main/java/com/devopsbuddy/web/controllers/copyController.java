package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Apache on 2017.12.29..
 */

@Controller
public class copyController {

    @RequestMapping("/copy")
    public String home(){

        return "copy/copy";

    }


}
