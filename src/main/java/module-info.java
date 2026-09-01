module com.example.baseballscoreboard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.baseballscoreboard to javafx.fxml;
    exports com.example.baseballscoreboard;
}