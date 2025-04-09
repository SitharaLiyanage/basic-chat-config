package lk.ijse.simplechat2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClientFormController {
    public TextField clientTxt;
    public Button cSendBtn;
    public TextArea clientRecents;



    public void clientSendBtnOnAction(ActionEvent actionEvent) {

        System.out.println(clientTxt.getText());
    }

}