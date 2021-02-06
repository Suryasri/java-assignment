package com.java.training.ui;

import com.java.training.controller.EmployeeController;
import com.java.training.controller.ProjectController;
import com.java.training.modal.Employee;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static EmployeeController employeeController = new EmployeeController();
    public static ProjectController projectController=new ProjectController();
    public static void main(String[] args) {
        printInstruction();
        printInstructionForProject();
        boolean exit = false;
        while (!exit) {
            System.out.println("enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    createEmployee();
                    break;
                case 2:
                    listEmployee();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    updateEmployee();
                    break;
                case 5:
                    createProject();
                    break;
                case 6:
                    listProject();
                    break;
                case 7:
                    deleteProject();
                    break;
                case 8:
                    updateProject();
                    break;
                case 9:
                    exit=true;
                    break;
            }
        }
    }
    public static void printInstruction(){
        System.out.println("choice your chooise");
        System.out.println("1.create employee details");
        System.out.println("2.list of employee details");
        System.out.println("3.update employee details");
        System.out.println("4.delete employee details");
    }

    public static void createEmployee() {
        System.out.println("Enter Employee Details");
        System.out.println("enter name");
        String name = scanner.next();
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println("enter salary");
        int salary = scanner.nextInt();
        System.out.println("enter id");
        int id = scanner.nextInt();
        employeeController.createEmployee(name, age, salary, id);
    }

    public static void listEmployee() {
        employeeController.listEmployee();
    }

    public static void deleteEmployee() {
        System.out.println("enter delete id");
        int deletId = scanner.nextInt();
        employeeController.deleteEmployee(deletId);
       // employeeController.listEmployee();
    }

    public static void updateEmployee() {
        System.out.println("update employee details");
        int updateId = scanner.nextInt();
        employeeController.updateEmployee(updateId);
        // employeeController.listEmployee();
    }

    public static void printInstructionForProject(){
        System.out.println("choice your chooise for project");
        System.out.println("5.create project details");
        System.out.println("6.list of project details");
        System.out.println("7.update project details");
        System.out.println("8.delete project details");
        System.out.println("9.quit");
    }
    public static void createProject() {
        System.out.println("enter projet details");
        System.out.println("enter projectname");
        String projectname = scanner.next();
        System.out.println("enter projectid");
        int projectid = scanner.nextInt();
        System.out.println("enter projectmodules");
        int projectmodules = scanner.nextInt();
        projectController.createProject(projectname, projectid, projectmodules);
    }

    public static void listProject() {
        projectController.listProject();
    }

    public static void deleteProject() {
        System.out.println("enter delete id");
        int deletId = scanner.nextInt();
        projectController.deleteProject(deletId);
    }

    public static void updateProject() {
        System.out.println("update project details");
        int updateId = scanner.nextInt();
        projectController.updateProject(updateId);
    }

}
