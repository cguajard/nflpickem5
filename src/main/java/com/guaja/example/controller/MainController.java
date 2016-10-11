package com.guaja.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by cguajardo on 9/15/16 at 7:50 PM
 */
@Controller
public class MainController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String homepage () {
        return "index.html";
    }
}
