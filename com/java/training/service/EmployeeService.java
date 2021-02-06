
package com.java.training.service;

import com.java.training.modal.Employee;
import com.java.training.repository.EmployeeRepository;

import java.util.*;

public class EmployeeService {
    private static Scanner scanner=new Scanner(System.in);

    EmployeeRepository employeeRepository = new EmployeeRepository();

    public void createEmployee(String name, int age, int salary,int id) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setAge(age);
        employee.setSalary(salary);

        employeeRepository.saveEmployee(employee);
    }

    List<Employee> employeeList = employeeRepository.listEmployees();
    public void listEmployee() {
        //print employee list
        for (Employee employee : employeeList)
            System.out.println(employee);
    }

    public void deleteEmployee(int deletId) {
        for (Employee employee : employeeList)
            if (employee.getId() == deletId) employeeList.remove(employee);
    }

    public void updateEmployee(int updateId){
        for(Employee employee: employeeList)
            if(employee.getId()==updateId){
                System.out.println("enter update name");
                String name= scanner.next();
                System.out.println("enter update age");
                int age=scanner.nextInt();
                System.out.println("enter update salary");
                int salary=scanner.nextInt();
                employee.setName(name);
                employee.setAge(age);
                employee.setSalary(salary);

            }
    }
    public List<Employee> sortByid(){
        List<Employee> employeeList=employeeRepository.listEmployees();
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId()-o2.getId();
            }
        });
        return employeeList;
    }
}

