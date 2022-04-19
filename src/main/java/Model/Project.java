package Model;

import java.time.LocalDate;
import java.util.HashMap;

/**
 * objects of this class holds the outline for a project.
 */
public class Project {
    private String projectName;
    private LocalDate deadline;
    private String description;
    private HashMap<User, Boolean> assignedUser;
    private Board board;
    private ProjectManager manager;
    private final static int projectID = 0;


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashMap<User, Boolean> getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(HashMap<User, Boolean> assignedUser) {
        this.assignedUser = assignedUser;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ProjectManager getManager() {
        return manager;
    }

    public void setManager(ProjectManager manager) {
        this.manager = manager;
    }


    /**
     * builder-class for Project
     */
    public class ProjectBuilder{

        public void builder(){

        }
    }

}
