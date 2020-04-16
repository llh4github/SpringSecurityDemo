package com.llh.securitydemo.controller;

import com.llh.securitydemo.model.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * AuthController
 * <p>
 * CreatedAt: 2020-04-16 22:03
 *
 * @author llh
 */
@Controller
@RequestMapping("auth")
public class AuthController {
    @GetMapping("loginPage")
    public String loginPage(ModelAndView mv) {

        mv.addObject("user", new SysUser());
        return "login";
    }

    @PostMapping("login")
    public String login(SysUser user) {
        System.out.println(user);
        return "home";
    }
}
