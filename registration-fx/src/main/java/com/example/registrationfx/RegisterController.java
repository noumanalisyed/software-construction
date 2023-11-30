package com.example.registrationfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Window;

import java.sql.SQLException;

public class RegisterController {

    @FXML
    private TextField fullNameField;

    @FXML
    private TextField emailIdField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button submitButton;

    @FXML
    private Button cancelButton;
    @FXML
    private MenuItem menuNewRegistration;

    @FXML
    public void register(ActionEvent event) throws SQLException {

        Window owner = submitButton.getScene().getWindow();

        System.out.println(fullNameField.getText().toString());
        String name = fullNameField.getText().toString();
        System.out.println(emailIdField.getText());
        System.out.println(passwordField.getText());
        if (fullNameField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter your name");
            return;
        }

        if (emailIdField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter your email id");
            return;
        }
        if (passwordField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter a password");
            return;
        }

        String fullName = fullNameField.getText();
        String emailId = emailIdField.getText();
        String password = passwordField.getText();

        JdbcDao jdbcDao = new JdbcDao();
        jdbcDao.insertRecord(fullName, emailId, password);

        showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
                "Welcome " + fullNameField.getText());
    }

    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    public void cancel(ActionEvent actionEvent) {
        Window owner = cancelButton.getScene().getWindow();
        this.cancel(actionEvent);
    }
}
