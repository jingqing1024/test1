package com.lingyue.dubbo.mycontroller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lingyue.dubbo.pojo.Student;
import com.lingyue.dubbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lingyue
 * @create 2021-05-17-17:34
 */
@Controller
public class StudentController {
    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;

    @RequestMapping("/getAllStudent")
    @ResponseBody
    public List<Student> findAllStudent( ) {

        List<Student> list = studentService.findAllStudent();

        return list;
    }

    @RequestMapping("/getStudentById")
    //@ResponseBody
    public String findStudentById(Model model, Integer id) {
        //ModelAndView mv = new ModelAndView();
        Student student = studentService.findAllStudentById(id);
        model.addAttribute("list", student);
        //model.addAttribute("");
        return "listStudent";
    }
}



