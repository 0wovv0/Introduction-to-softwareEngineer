module com.example.introductiontose {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires annotations;
    
    
    opens com.example.introductiontose to javafx.fxml;
    exports com.example.introductiontose;
    exports com.example.introductiontose.controller;
    opens com.example.introductiontose.controller to javafx.fxml;
}