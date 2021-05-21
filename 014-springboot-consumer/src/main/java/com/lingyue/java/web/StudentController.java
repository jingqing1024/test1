package com.lingyue.java.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lingyue.java.domain.Student;
import com.lingyue.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author lingyue
 * @create 2021-05-20-0:31
 */
@Controller
public class StudentController {
    @Reference(interfaceClass = StudentService.class, version = "1.0.0", check = false)
    private StudentService studentService;

    @RequestMapping("/getStudentById")
    public String getStudentById(Model model, Integer id) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "studentDetail";
    }

    @RequestMapping("/getAllStudent")
    public String getAllStudent(Model model) {
        List<Student> list = studentService.getAllStudent();
        model.addAttribute("stulist", list);
        return "list";
    }
}
