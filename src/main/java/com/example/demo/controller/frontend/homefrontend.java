package com.example.demo.controller.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homefrontend {

    @RequestMapping(value = {"/", "home"})
    public String homePage(Model model){
        return "/frontend/home";
    }

}
