package com.lingyue.java.web;

import com.lingyue.java.domain.Student;
import com.lingyue.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lingyue
 * @create 2021-05-11-23:13
 */
//@RestController 表示此类下所有方法皆返回json数据类型，方法上无需在写@requestBody
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/find")
    @ResponseBody
    public Student findStudentById(Integer id) {
        Student student = studentService.selectStudentById(id);
        return student;
    }

    @RequestMapping("/findAllStudnet")
    @ResponseBody
    public List<Student> getAllStudent() {
        List<Student> allStudent = studentService.findAllStudent();
        return allStudent;
    }

    @RequestMapping("/updataStudentById")
    public Integer updateStudent(Student student) {
        Integer i = studentService.updateStudentById(student);
        return i;
    }

    @GetMapping("/getTest")//此注解多用于查询操作，为get请求
    @ResponseBody
    public String getTest() {
        return "Get request only";
    }
    @PostMapping("/postTest")//此注解多用于插入操作，为post请求
    @ResponseBody
    public String postTest() {
        return "post request only";
    }
    @DeleteMapping("/deleteTest")//此注解多用于删除操作，为delete请求
    @ResponseBody
    public String deleteTest() {
        return "delete request only";
    }
    @PutMapping("/putTest")//此注解多用于修改操作，为put请求
    @ResponseBody
    public String putTest() {
        return "put request only";
    }
}
