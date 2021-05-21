package com.lingyue.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lingyue.dubbo.service.StudentService;
import org.springframework.stereotype.Component;

/**
 * @author lingyue
 * @create 2021-05-17-16:31
 */
@Component
@Service(interfaceClass = StudentService.class,version ="1.0.0",timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Integer getCount() {
        return 51;
    }
}
