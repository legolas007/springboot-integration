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
        Employee employee = new Employee();
        employee.setdId(2);
        employee.setEmail("dfjvi@qq.com");
        employee.setGender(0);
        employee.setLastName("usher");
        employee.setdId(1);
        employeeMapper.updateEmp(employee);

        System.out.println(employee);
    }

    @Test
    public void deleteEmpById() {
    }

    @Test
    public void insertEmployee() {
    }
}