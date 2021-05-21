package com.lingyue.java.controller;

import com.lingyue.java.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lingyue
 * @create 2021-05-18-18:28
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUserDetail")
    public @ResponseBody User getUser() {
        User user = new User();
        user.setId(1001);
        user.setUsername("灵月");
        return user;
    }

    @RequestMapping("/page/getPageUser")
    public String getPageUser(Model model) {
        User user = new User();
        user.setId(1001);
        user.setUsername("灵月");
        model.addAttribute("user", user);
        return "userPage";
    }
}
