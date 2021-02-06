package com.java.training.modal;

public class Project {
    private String projectname;
    private int projectid;
    private int projectmodules;

    public Project(String projectname, int projectid, int projectmodules) {
        this.projectname = projectname;
        this.projectid = projectid;
        this.projectmodules = projectmodules;
    }

    public int getProjectid() { return projectid; }

    public void setProjectname(String projectname) { this.projectname = projectname; }

    public void setProjectid(int projectid) { this.projectid = projectid; }

    public void setProjectmodules(int projectmodules) { this.projectmodules = projectmodules; }

    @Override
    public String toString() {
        return "Project{" +
                "projectname='" + projectname + '\'' +
                ", projectid=" + projectid +
                ", projectmodules=" + projectmodules +
                '}';
    }
}
