package com.lingyue.java.mycontroller;

import com.lingyue.java.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lingyue
 * @create 2021-05-11-17:19
 */
@Controller
public class MyController {
    @Autowired
    private Person person;
    /*@Value("${name}")
    private String name;
    @Value("${age}")
    int age;*/

    @RequestMapping("/springboot")
    @ResponseBody
    public String test() {

        return "Hello,SpringBoot" + person;
    }

    @RequestMapping("/index")
    public ModelAndView show() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "hello,springboot");
        mv.setViewName("show");
        return mv;
    }
}
