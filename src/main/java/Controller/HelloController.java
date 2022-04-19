package Controller;

import com.example.exsto.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button loginBtn;
    @FXML
    private Button newUserBtn;
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField usernameTextField;

    public void newUserScene () {
        Main main = new Main();
        if(usernameTextField.getText().equals("123") && passwordTextField.getText().equals("123")){
            main.changeScene("UserScene.fxml");
        }else{
            System.out.println("nope");
        }
    }
}