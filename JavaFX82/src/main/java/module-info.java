module com.example.javafx82 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx82 to javafx.fxml;
    exports com.example.javafx82;
}