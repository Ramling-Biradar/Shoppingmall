// EmployeeServiceImpl.java
package com.example.mall.service.impl;

import com.example.mall.model.Employee;
import com.example.mall.repository.EmployeeRepository;
import com.example.mall.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee searchEmployee(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return !employeeRepository.existsById(id);
    }
}
