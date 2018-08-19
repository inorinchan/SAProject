package SAProject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class TempController {

    @FXML
    private void handleBtnBack(ActionEvent event){
        Button b = (Button) event.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
        try {
            stage.setScene(new Scene(loader.load(),500,350));
            stage.show();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
