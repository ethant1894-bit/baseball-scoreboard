package com.example.baseballscoreboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scoreboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1027, 529);
        stage.setScene(scene);
        stage.show();

        FXMLLoader fxmlLoaderControls = new FXMLLoader(HelloApplication.class.getResource("scoreboardControls.fxml"));
        Stage secondStage = new Stage();
        Scene scene2 = new Scene(fxmlLoaderControls.load(), 840, 624);
        secondStage.setScene(scene2);
        secondStage.show();
    }
}
