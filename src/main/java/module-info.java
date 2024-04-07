module com.example.project21 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project21 to javafx.fxml;
    exports com.example.project21;
}