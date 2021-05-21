package com.lingyue.java.controller;

import com.lingyue.java.user.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lingyue
 * @create 2021-05-18-16:33
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/login")
    public String userLogin(HttpServletRequest request) {
        User user = new User();
        user.setId(1001);
        user.setUsername("lingyue");
        request.getSession().setAttribute("user", user);
        return "login success";
    }
    @RequestMapping("/center")
    public String userCenter() {
        return "user center";
    }
    @RequestMapping("/out")
    public String userout() {
        return "user out";
    }
    @RequestMapping("/error")
    public String userError() {
        return "user error";
    }
}
