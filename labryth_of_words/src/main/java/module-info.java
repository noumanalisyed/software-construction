module com.example.labryth_of_words {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.labryth_of_words to javafx.fxml;
    exports com.example.labryth_of_words;
}
