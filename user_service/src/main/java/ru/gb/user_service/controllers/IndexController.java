package ru.gb.user_service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/users")
    public String index() {
        return "index";
    }
}
