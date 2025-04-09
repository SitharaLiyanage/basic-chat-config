package lk.ijse.simplechat2;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ServerFormController {

    public TextArea serverResents;
    public TextField serverTxt;
    public Button sSendBtn;

    public void serverSendBtnOnAction(ActionEvent actionEvent) {

        System.out.println(serverTxt.getText());
    }
}
