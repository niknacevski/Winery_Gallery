package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.service.WineService;

@Controller
@RequestMapping("/")
public class HomeController {

    private final WineService wineService;

    public HomeController(WineService wineService) {
        this.wineService = wineService;
    }

    @GetMapping
    public String getHomePage() {
        return "master_template";
    }
}
