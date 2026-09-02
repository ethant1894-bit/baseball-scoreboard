package com.example.baseballscoreboard;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;


public class ScoreboardController {


    // Scoreboard Elements

    @FXML
    private Button firstBase;

    @FXML
    private Button secondBase;

    @FXML
    private Button thirdBase;

    @FXML
    private Polygon inningPart;

    @FXML
    private Text inningNumber;

    @FXML
    private Text outCount;

    @FXML
    private Text pitcherName;

    @FXML
    private Text hitterName;

    @FXML
    private Text pitchCount;

    @FXML
    private Text battingAverage;

    @FXML
    private Text tm1Name;

    @FXML
    private Text tm2Name;

    @FXML
    private Text tm1Score;

    @FXML
    private Text tm2Score;

    @FXML
    private Text balls;

    @FXML
    private Text strikes;

    private Game game;

    public void setGame(Game gameModel) {
        this.game = gameModel;
        tm1Score.textProperty().bind(game.getTeam1Points());
        tm2Score.textProperty().bind(game.getTeam2Points());
    }
}




