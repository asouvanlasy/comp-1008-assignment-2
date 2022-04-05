module com.example.weeklyschedule {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;


    opens com.example.weeklyschedule to javafx.fxml;
    exports com.example.weeklyschedule;
}