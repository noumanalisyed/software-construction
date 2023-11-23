package com.example.employeejavafxspringjdbc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class HelloApplication extends Application implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Fetch Data");
        btn.setOnAction(e -> fetchDataFromDatabase());

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("JavaFX with Spring JDBC Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void fetchDataFromDatabase() {
        // Use jdbcTemplate to perform database operations
        // For simplicity, let's assume there is a 'users' table in the database
        String query = "SELECT * FROM users";
        jdbcTemplate.query(query, (rs, rowNum) -> rs.getString("username"))
                .forEach(System.out::println);
    }

    @Override
    public void run(String... args) throws Exception {
        // Your database initialization code can go here
    }
}
