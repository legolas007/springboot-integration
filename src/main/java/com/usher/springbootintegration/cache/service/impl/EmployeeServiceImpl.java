package com.usher.springbootintegration.cache.service.impl;

import com.usher.springbootintegration.cache.bean.Employee;
import com.usher.springbootintegration.cache.mapper.EmployeeMapper;
import com.usher.springbootintegration.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @Author: Usher
 * @Description:
 */
@Service
@CacheConfig(cacheNames="emp")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    //@Cacheable(cacheNames = "emp",key = "#root.methodName + '['+#id+']'")
    @Cacheable(cacheNames = "emp",keyGenerator = "myKeyGenerator",condition = "#a0>1")
    public Employee getEmp(Integer id) {
        System.out.println("查询" + id + "号员工");
        Employee employee = employeeMapper.getEmpById(id);
        return employee;
    }

    @Override
    @CachePut(key="#result.id")
    public Employee updateEmp(Employee employee) {
        System.out.println("updateEmp:" + employee);
        employeeMapper.updateEmp(employee);
        return employee;
    }

    @Override
    @CacheEvict(key = "#id")
    public void deleteEmp(Integer id) {
        employeeMapper.deleteEmpById(id);
        System.out.println(id);
    }

    @Override
    @Caching(
            cacheable = {
                    @Cacheable(/*value = "emp",*/key = "#lastName")
            },
            put = {
                    @CachePut(/*value = "emp",*/key = "#result.id"),
                    @CachePut(/*value = "emp",*/key = "#result.email")
            }
    )
    public Employee getEmpLastName(String lastName) {
        return employeeMapper.getEmpByLastName(lastName);
    }

}
