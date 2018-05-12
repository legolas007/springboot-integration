package com.usher.springbootintegration.cache.service.impl;

import com.usher.springbootintegration.cache.bean.Employee;
import com.usher.springbootintegration.cache.mapper.EmployeeMapper;
import com.usher.springbootintegration.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Usher
 * @Description:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Employee getEmp(Integer id) {
        System.out.println("查询" + id + "号员工");
        Employee employee = employeeMapper.getEmpById(id);
        return employee;
    }
}
