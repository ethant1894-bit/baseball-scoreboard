package com.example.baseballscoreboard;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
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

    // Base Toggle Colours
    Background onBaseBG = new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY));
    Background notOnBaseBG = new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY));

    public void setGame(Game gameModel) {
        this.game = gameModel;
        tm1Score.textProperty().bind(game.getTeam1Points());
        tm2Score.textProperty().bind(game.getTeam2Points());
        balls.textProperty().bind(game.getBalls());
        strikes.textProperty().bind(game.getStrikes());
        outCount.textProperty().bind(game.getOuts());
        firstBase.backgroundProperty().bind(Bindings.when(game.getFirstBase()).then(onBaseBG).otherwise(notOnBaseBG));
        secondBase.backgroundProperty().bind(Bindings.when(game.getSecondBase()).then(onBaseBG).otherwise(notOnBaseBG));
        thirdBase.backgroundProperty().bind(Bindings.when(game.getThirdBase()).then(onBaseBG).otherwise(notOnBaseBG));
    }
}




