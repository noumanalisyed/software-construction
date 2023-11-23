module com.example.registrationfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.registrationfx to javafx.fxml;
    exports com.example.registrationfx;
}
