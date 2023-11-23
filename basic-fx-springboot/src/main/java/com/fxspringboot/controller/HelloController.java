package com.fxspringboot.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField txtName;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(getTextValue());

    }
    protected String getTextValue(){
        return txtName.getText().toString();
    }
}
