package com.lingyue.java.service.Impl;

import com.lingyue.java.domain.Student;
import com.lingyue.java.mapper.StudentMapper;
import com.lingyue.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lingyue
 * @create 2021-05-11-23:17
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper studentMapper;
    @Override
    public Student selectStudentById(Integer id) {

        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    @Override
    public List<Student> findAllStudent() {
        List<Student> students = studentMapper.selectAllStudent();
        return students;
    }

    @Override
    @Transactional
    public Integer updateStudentById(Student student) {
        Integer i = studentMapper.updateByPrimaryKeySelective(student);
        //int x = 10 / 0;
        return i;
    }
}
