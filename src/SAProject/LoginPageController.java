package SAProject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController {
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Label errorMessageLogin;
    @FXML
    private Pane pane;

    private String user = "admin";
    private String password = "admin";
    private String a;
//    private void initialize() {
//        pane.getParent().setOnKeyPressed(new EventHandler<KeyEvent>() {
//            public void handle(KeyEvent event) {
//                switch (event.getCode()) {
//                    case ENTER:
//                        handleBtnLogin(new ActionEvent());
//                        break;
//                }
//            }
//        });
//    }

    @FXML
    private void handleBtnLogin(ActionEvent event) {
        if (usernameTextField.getText().equals(user)) {
            if (passwordTextField.getText().equals(password)) {
                Button b = (Button) event.getSource();
                Stage stage = (Stage) b.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Temp.fxml"));
                try {
                    stage.setScene(new Scene(loader.load(), 600, 400));
                    stage.show();

                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                errorMessageLogin.setText("Username or Password is incorrect.");
                usernameTextField.clear();
                passwordTextField.clear();
            }
        } else {
            errorMessageLogin.setText("Username or Password is incorrect.");
            usernameTextField.clear();
            passwordTextField.clear();

        }

    }


}
