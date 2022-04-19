package Controller;

import Model.*;

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
    private ServerStub serverStub;

    public void createNewProject(String name, String description, LocalDate deadline, User userAdmin) {
    }

    public void editProject () {
    }

    public void listProjects () {

    }

    /**
     * @param username the choosen username
     * @param password the chosen password
     * @param profilePicture
     */
    public void registerNewUser (String username, String password, Image profilePicture) {
        if(username != null && password != null && checkUsername(username)) {
            user = userManager.createNewUser(username, password, profilePicture);
        }
        //todo felmeddelande annars?
    }

    public boolean checkUsername (String username) { //todo ändrat parametrar
        boolean uniqueUsername = serverStub.checkUsername(username);
        return uniqueUsername;
    }

    public void displayMyPages () {
    }

    public void displayCalender () {
    }

    public boolean logIn (String username, String password) {
        boolean login = serverStub.loginCheck(username, password);
        return login;
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
