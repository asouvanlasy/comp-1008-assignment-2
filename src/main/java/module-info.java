module com.example.weeklyschedule {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.weeklyschedule to javafx.fxml;
    exports com.example.weeklyschedule;
}