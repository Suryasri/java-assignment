package com.java.training.repository;

import com.java.training.modal.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    static List<Employee> employeeList=new ArrayList<>();

    public void saveEmployee(Employee employee)
    {
        employeeList.add(employee);
    }
    public List<Employee> listEmployees()
    {
        return employeeList;
    }
}
