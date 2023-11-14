package com.javafx.spring.jdbc.javafxspringjdbc;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class FileMenuController {

    public void exit(ActionEvent actionEvent) {
        Platform.exit();
    }
}
