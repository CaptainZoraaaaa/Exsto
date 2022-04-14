package Model;

/**
 * @author Anna Håkansson
 * @version 1.0
 *
 * Class for managing user functionality
 */
public class UserManager {
    private User user; //current user
    private Controller controller; //controller

    /**
     * @author Anna Håkansson
     *
     * @param username the selected username
     * @param password the selected password
     * @param profilePicture the users profile picture
     * @return the new userObject
     *
     * Method for create new user with a UserBuilder.
     */
    public User createNewUser(String username, String password, Image profilePicture) {
        //TODO check in server if username doesn't exist
        if(username != null && username != "" && password != null && password != "") { //if username and password isnt null or empty string
            User user = new User.UserBuilder() //make new user with builder
                    .username(username)
                    .password(password)
                    .profilePicture(profilePicture)
                    .build();
        }
        return user; //return the new user
    }

    /**
     * Method for editing user. Needs refining.
     */
    public void editUser() {
        //TODO osäker på vad som skall göras
    }
}
