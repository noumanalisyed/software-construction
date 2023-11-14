module com.javafx.spring.jdbc.javafxspringjdbc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.javafx.spring.jdbc.javafxspringjdbc to javafx.fxml;
    exports com.javafx.spring.jdbc.javafxspringjdbc;
}
