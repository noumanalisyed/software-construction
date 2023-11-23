module com.example.basicjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.basicjavafx to javafx.fxml;
    exports com.example.basicjavafx;
}
