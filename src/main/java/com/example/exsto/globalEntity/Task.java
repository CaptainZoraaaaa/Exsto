package com.example.exsto.globalEntity;

import java.util.ArrayList;
import java.util.HashMap;

public class Task {
    private String header;
    private String description;
    private String estimatedTime;
    private Swimlane currentStatus;
    private ArrayList<User> assignees = new ArrayList<>();
    private ArrayList<Task> dependencies  = new ArrayList<>();
    private boolean flaggedForHelp;
    private User creator;
    private HashMap<String, String> comments = new HashMap<>(); // String 1 = username, String 2 = comment.
    final static int TASK_ID = 0;

    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getEstimatedTime() {
        return estimatedTime;
    }
    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }
    public Swimlane getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(Swimlane currentStatus) {
        this.currentStatus = currentStatus;
    }
    public ArrayList<User> getAssignees() {
        return assignees;
    }
    public void setAssignees(ArrayList<User> assignees) {
        this.assignees = assignees;
    }
    public ArrayList<Task> getDependencies() {
        return dependencies;
    }
    public void setDependencies(ArrayList<Task> dependencies) {
        this.dependencies = dependencies;
    }
    public boolean isFlaggedForHelp() {
        return flaggedForHelp;
    }
    public void setFlaggedForHelp(boolean flaggedForHelp) {
        this.flaggedForHelp = flaggedForHelp;
    }
    public User getCreator() {
        return creator;
    }
    public void setCreator(User creator) {
        this.creator = creator;
    }
    public HashMap<String, String> getComments() {
        return comments;
    }
    public void setComments(HashMap<String, String> comments) {
        this.comments = comments;
    }

    public class TaskBuilder{
        private final Task task = new Task();

        public Task build(){
            return task;
        }
        public TaskBuilder header(String header){
            task.setHeader(header);
            return this;
        }
        public TaskBuilder description(String description){
            task.setDescription(description);
            return this;
        }
        public TaskBuilder estimatedTime(String time){
            task.setEstimatedTime(time);
            return this;
        }
        public TaskBuilder currentStatus(Swimlane currentStatus){
            task.setCurrentStatus(currentStatus);
            return this;
        }
        public TaskBuilder assignee(ArrayList<User> assignees){
            task.setAssignees(assignees);
            return this;
        }
        public TaskBuilder dependency(ArrayList<Task> dependency){
            task.setDependencies(dependency);
            return this;
        }
        public TaskBuilder flaggedForHelp(boolean flag){
            task.setFlaggedForHelp(flag);
            return this;
        }
        public TaskBuilder creator(User creator){
            task.setCreator(creator);
            return this;
        }
        public TaskBuilder comments(HashMap<String, String> comments){
            task.setComments(comments);
            return this;
        }


    }


}
