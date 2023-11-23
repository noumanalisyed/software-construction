package com.example.registrationfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

import java.sql.SQLException;

public class EmployeeController {

    @FXML
    private TextField fullNameField;

    @FXML
    private TextField jobTitleField;

    @FXML
    private TextField addressField;

    @FXML
    private Button submitButton;

    @FXML
    private Button cancelButton;

    @FXML
    public void register(ActionEvent event) throws SQLException {

        Window owner = submitButton.getScene().getWindow();

        System.out.println(fullNameField.getText().toString());
        String name = fullNameField.getText().toString();
        System.out.println(jobTitleField.getText());
        System.out.println(addressField.getText());
        if (fullNameField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter your name");
            return;
        }

        if (jobTitleField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter your Job Title");
            return;
        }
        if (addressField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "Please enter a Address");
            return;
        }

        String fullName = fullNameField.getText();
        String jobTitle = jobTitleField.getText();
        String address = addressField.getText();

        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.insertRecord(fullName, jobTitle, address);

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
        System.exit(0);
    }
}
