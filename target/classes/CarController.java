

package com.mt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/")
    public String index(Model model) {
        // Add any data you want to pass to the Thymeleaf template here
        model.addAttribute("message", "Welcome to Self-Drive Car Rental");
        return "index"; // "index" refers to the Thymeleaf template (index.html)
    }
}
