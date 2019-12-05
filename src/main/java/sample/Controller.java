package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Controller {
    @FXML private Button changeBtn;


    @FXML
    public void onAction(javafx.event.ActionEvent event) throws IOException {
        Parent userAccountParent = FXMLLoader.load(getClass().getResource("NewPage.fxml"));
        Scene roomAvScene = new Scene(userAccountParent);

        Stage uAWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        uAWindow.setScene(roomAvScene);
        uAWindow.show();
    }

}
