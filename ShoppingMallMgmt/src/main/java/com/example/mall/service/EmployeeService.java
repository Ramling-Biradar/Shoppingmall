package com.example.mall.service;
import com.example.mall.model.Employee;
public interface EmployeeService {
	Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    Employee searchEmployee(int id);
    boolean deleteEmployee(int id);

}
