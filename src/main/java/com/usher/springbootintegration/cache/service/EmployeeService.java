package com.usher.springbootintegration.cache.service;

import com.usher.springbootintegration.cache.bean.Employee;

/**
 * @Author: Usher
 * @Description:
 */
public interface EmployeeService {
    Employee getEmp(Integer id);
    Employee updateEmp(Employee employee);
    void deleteEmp(Integer id);
    Employee getEmpLastName(String lastName);
}
