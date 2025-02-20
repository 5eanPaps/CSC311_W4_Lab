module com.example.csc311_w4_lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311_w4_lab to javafx.fxml;
    exports com.example.csc311_w4_lab;
}