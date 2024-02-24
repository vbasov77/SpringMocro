package ru.gb.task_service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/tasks")
    public String index() {
        return "index";
    }
}
