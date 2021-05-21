package com.lingyue.java.service;

import com.lingyue.java.domain.Student;

import java.util.List;

/**
 * @author lingyue
 * @create 2021-05-20-0:36
 */
public interface StudentService {
    Student getStudentById(Integer id);

    List<Student> getAllStudent();
}
