module com.fxspringboot.basicfxspringboot {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.boot.autoconfigure;
    requires org.slf4j;
    requires spring.context;
    requires spring.boot;
    requires spring.beans;
    requires spring.core;
   /* requires rt;
    requires jfxrt;*/

    opens com.fxspringboot.controller to javafx.fxml;
    exports com.fxspringboot.controller;
}
