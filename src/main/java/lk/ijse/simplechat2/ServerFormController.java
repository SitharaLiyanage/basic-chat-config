package lk.ijse.simplechat2;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFormController {

    public TextArea serverResents;
    public TextField serverTxt;
    public Button sSendBtn;

    public void initialize() {

        try {
            ServerSocket serverSocket = new ServerSocket(4009);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String message = dataInputStream.readUTF();
            serverResents.appendText(message+"\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void serverSendBtnOnAction(ActionEvent actionEvent) {

        System.out.println(serverTxt.getText());
    }
}
