package com.usher.springbootintegration.cache.mapper;

import com.usher.springbootintegration.cache.bean.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author: Usher
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest

public class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;


    @Test
    public void getEmpById() {
        Employee employee = employeeMapper.getEmpById(1);
        System.out.println(employee);
    }

    @Test
    public void updateEmp() {
    }

    @Test
    public void deleteEmpById() {
    }

    @Test
    public void insertEmployee() {
    }
}