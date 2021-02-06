package com.java.training.controller;

import com.java.training.repository.EmployeeRepository;
import com.java.training.service.EmployeeService;

public class EmployeeController {
    EmployeeService employeeService=new EmployeeService();

   public void  createEmployee(String name,int age,int salary,int id)
    {
        //validations
        //call create employee
        employeeService.createEmployee(name,age,salary,id);
    }
    public void listEmployee(){
       employeeService.listEmployee();
    }

    public void deleteEmployee(int deletId){
       employeeService.deleteEmployee(deletId);
    }

    public void updateEmployee(int updateId){
       employeeService.updateEmployee(updateId);
    }

}
