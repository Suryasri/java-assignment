package com.java.training.controller;

import com.java.training.repository.ProjectRepository;
import com.java.training.service.ProjectService;

public class ProjectController {
    ProjectService projectService = new ProjectService();
    // ProjectRepository projectRepository=new ProjectRepository();

    public void createProject(String projectname, int projectid, int projectmodules) {
        projectService.createProject(projectname, projectid, projectmodules);
    }
        public void listProject () {
            projectService.listProject();
        }

        public void deleteProject ( int deletId){
            projectService.deleteProject(deletId);
        }

        public void updateProject ( int updateId){
            projectService.updateProject(updateId);
        }
}
