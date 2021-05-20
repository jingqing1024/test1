package com.lingyue.java.mapper;

import com.lingyue.java.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    List<Student> selectAllStudent();

    Integer updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}