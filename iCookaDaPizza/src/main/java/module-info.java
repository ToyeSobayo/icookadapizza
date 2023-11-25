module com.example.icookadapizza {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.icookadapizza to javafx.fxml;
    exports com.example.icookadapizza;
    exports com.example.icookadapizza.Controllers;
    opens com.example.icookadapizza.Controllers to javafx.fxml;
}