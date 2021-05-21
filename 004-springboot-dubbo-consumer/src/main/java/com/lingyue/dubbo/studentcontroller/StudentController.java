package com.lingyue.dubbo.studentcontroller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lingyue.dubbo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lingyue
 * @create 2021-05-17-16:26
 */
@Controller

public class StudentController {
    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;
    @ResponseBody
    @RequestMapping("/findStudent")
    public Object findStu() {
        Integer count = studentService.getCount();
        return count;
    }
}
