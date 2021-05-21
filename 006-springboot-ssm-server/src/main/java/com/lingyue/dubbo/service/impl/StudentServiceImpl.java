package com.lingyue.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lingyue.dubbo.dao.StudentMapper;
import com.lingyue.dubbo.pojo.Student;
import com.lingyue.dubbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lingyue
 * @create 2021-05-17-17:42
 */
@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> findAllStudent() {
        List<Student> students = studentMapper.selectAll();
        return students;
    }

    @Override
    public Student findAllStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }
}
