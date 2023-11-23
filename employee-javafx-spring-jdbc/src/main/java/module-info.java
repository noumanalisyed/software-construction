module com.example.employeejavafxspringjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.jdbc;
    requires spring.boot;
    requires java.sql;


    opens com.example.employeejavafxspringjdbc to javafx.fxml;
    exports com.example.employeejavafxspringjdbc;
}
