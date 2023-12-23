package com.example.demo.web.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public String userProfile(Model model, Authentication authentication, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (authentication != null && user == null) {
            String username = authentication.getName();
            user = userService.findByUsername(username);
            request.getSession().setAttribute("user", user);
        }
        model.addAttribute("user", user);
        model.addAttribute("searchUser", "");
        return "view1";
    }












}