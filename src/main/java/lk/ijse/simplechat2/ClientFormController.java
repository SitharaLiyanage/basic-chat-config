package lk.ijse.simplechat2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField clientTxt;
    public Button cSendBtn;
    public TextArea clientRecents;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void clientSendBtnOnAction(ActionEvent actionEvent) {
    }

    public void clientTxtBtnOnAction(ActionEvent actionEvent) {
    }
}