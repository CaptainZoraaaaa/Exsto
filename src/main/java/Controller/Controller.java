package Controller;

import Model.ProjectManager;
import Model.Swimlane;
import Model.User;
import Model.UserManager;
import javafx.concurrent.Task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Controller {
    private Task task;
    private User user;
    private ArrayList<Project> projects = new ArrayList<Project>();
    private TaskManager taskManager;
    private UserManager userManager;
    private ProjectManager projectManager;

    public void createNewProject(String name, String description, LocalDate deadline, User userAdmin) {
    }

    public void editProject () {
    }

    public void listProjects () {

    }

    public void registerNewUser () {

    }

    public boolean checkUsername () {
        return true;
    }

    public void displayMyPages () {
    }

    public void displayCalender () {
    }

    public boolean logIn () {
        return true;
    }

    public void logOut () {
    }

    public void createTask () {
    }

    public void editTask () {
    }

    public void assignToTask () {
    }

    public void commentTask () {
    }

    public void editCommentOnTask () {
    }

    public void flagForHelp () {
    }

    public void deFlagHelp () {
    }

    public void showFlaggedTasks () {
    }

    public void archiveTasks () {
    }

    public void deleteTask () {
    }

    public void retrieveTask () {
    }

    public void sendTaskDetails () {
    }

    public void sendProjectDetails () {
    }

    public void changeSwimlaneTaskLimit (Swimlane swimlane, Task task) {
    }

    public void sendStatistics () {
    }

    public void sendCalender () {
    }

    public void changeProject (int projectID) {

    }

    public void operation () {
    }
}
