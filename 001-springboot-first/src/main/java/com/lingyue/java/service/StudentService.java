package com.lingyue.java.service;

import com.lingyue.java.domain.Student;

import java.util.List;

/**
 * @author lingyue
 * @create 2021-05-11-23:16
 */
public interface StudentService {
    Student selectStudentById(Integer id);

    List<Student> findAllStudent();

    Integer updateStudentById(Student student);
}
