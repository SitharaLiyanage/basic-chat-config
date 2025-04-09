package lk.ijse.simplechat2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader clientLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene clientScene = new Scene(clientLoader.load());
        Stage clientStage = new Stage();
        clientStage.setTitle("Client");
        clientStage.setScene(clientScene);


        clientStage.setX(100);
        clientStage.setY(100);
        clientStage.show();


        FXMLLoader serverLoader = new FXMLLoader(getClass().getResource("server-form.fxml"));
        Scene serverScene = new Scene(serverLoader.load());
        Stage serverStage = new Stage();
        serverStage.setTitle("Server");
        serverStage.setScene(serverScene);


        serverStage.setX(clientStage.getX() + 650);
        serverStage.setY(clientStage.getY());
        serverStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
