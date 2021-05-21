package com.lingyue.java.mapper;

import com.alibaba.dubbo.config.annotation.Service;
import com.lingyue.java.domain.Student;
import com.lingyue.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lingyue
 * @create 2021-05-20-0:39
 */
@Component
@Service(interfaceClass = StudentService.class, version = "1.0.0", timeout = 15000)
public class service implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> list = studentMapper.selectAllStudent();
        return list;
    }
}
