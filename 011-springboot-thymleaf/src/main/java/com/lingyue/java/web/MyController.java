package com.lingyue.java.web;

import com.lingyue.java.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author lingyue
 * @create 2021-05-19-16:31
 */
@Controller
public class MyController {
    @RequestMapping("/index")
    public ModelAndView getIndex() {
        ModelAndView mv = new ModelAndView();
        User user = new User();
        mv.addObject("info", "hello,thymeleaf");
        user.setId(1001);
        user.setUserName("灵月");
        mv.addObject("user", user);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(Integer id, String userName) {
        return id + userName;
    }

    @RequestMapping("/urljs")
    public String testJs() {
        return "urlJS";
    }

    @RequestMapping("/userlist")
    public ModelAndView userList() {
        ModelAndView mv = new ModelAndView();
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(100 + i);
            user.setUserName("灵" + i);
            user.setAge(10 + i);
            list.add(user);
        }
        mv.addObject("userlist", list);
        mv.setViewName("userlist");
        return mv;
    }
    @RequestMapping("/usermap")
    public String usermap(Model model) {
        HashMap<Object, Object> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(100 + i);
            user.setUserName("灵" + i);
            user.setAge(10 + i);
            map.put(i, user);
        }
        model.addAttribute("usermap", map);
        return "usermap";
    }
}
