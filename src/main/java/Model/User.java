package Model;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.HashMap;

public class User {

    private String username;
    private String password;
    private Image profilePicture;
    private HashMap<Project, Boolean> projects = new HashMap<>();
    private ArrayList<Task> myTasks = new ArrayList<>();

    private final static int USERID = 0;
    //osäker på hur man hanterar statisk variabel. lämnar orörd så länge


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Image getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Image profilePicture) {
        this.profilePicture = profilePicture;
    }

    public HashMap<Project, Boolean> getProjects() {
        return projects;
    }

    public void setProjects(HashMap<Project, Boolean> projects) {
        this.projects = projects;
    }

    public ArrayList<Task> getMyTasks() {
        return myTasks;
    }

    public void setMyTasks(ArrayList<Task> myTasks) {
        this.myTasks = myTasks;
    }

    public static class UserBuilder {

        private final User user = new User();

        public User build() {
            return user;
        }

        public UserBuilder username(String username) {
            user.setUsername(username);
            return this;
        }

        public UserBuilder password(String password) {
            user.setPassword(password);
            return this;
        }

        public UserBuilder image(Image image) {
            user.setProfilePicture(image);
            return this;
        }

        public UserBuilder projects(HashMap<Project, boolean> projects) {
            user.setProjects(projects);
            return this;
        }

        public UserBuilder tasks(ArrayList<Task> tasks) {
            user.setMyTasks(tasks);
            return this;
        }
    }

}
