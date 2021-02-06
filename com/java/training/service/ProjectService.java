package com.java.training.service;

import com.java.training.modal.Employee;
import com.java.training.modal.Project;
import com.java.training.repository.ProjectRepository;

import java.util.List;
import java.util.Scanner;

public class ProjectService {
    private static Scanner scanner=new Scanner(System.in);
    ProjectRepository projectRepository=new ProjectRepository();
     public void createProject(String projectname,int projectid,int projectmodules){
         Project project=new Project(projectname,projectid,projectmodules);
         project.setProjectname(projectname);
         project.setProjectid(projectid);
         project.setProjectmodules(projectmodules);
         projectRepository.saveProject(project);
     }

    List<Project> projectList = projectRepository.listProject();
    public void listProject() {
        for (Project project : projectList)
            System.out.println(project);
    }

    public void deleteProject(int deletId) {
        for (Project project : projectList)
            if (project.getProjectid() == deletId) projectList.remove(project);
    }

    public void updateProject(int updateId){
        for(Project project: projectList)
            if(project.getProjectid()==updateId){
                System.out.println("enter update name");
                String projectname= scanner.next();
                System.out.println("enter update age");
                int projectid=scanner.nextInt();
                System.out.println("enter update salary");
                int projectmodile=scanner.nextInt();
                project.setProjectname(projectname);
                project.setProjectid(projectid);
                project.setProjectmodules(projectmodile);

            }
    }
}
