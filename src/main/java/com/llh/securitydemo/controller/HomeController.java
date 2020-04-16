package com.llh.securitydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeController
 * <p>
 * CreatedAt: 2020-04-16 22:07
 *
 * @author llh
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("home")
    public String homePage() {
        return "home";
    }
}
