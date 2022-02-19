package com.example.demo.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/backend/product")
public class productbackend {

    @RequestMapping(value = "create")
    public String create()
    {
        return "/backend/product";
    }
}
