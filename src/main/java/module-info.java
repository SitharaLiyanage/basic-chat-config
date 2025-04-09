module lk.ijse.simplechat2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.simplechat2 to javafx.fxml;
    exports lk.ijse.simplechat2;
}