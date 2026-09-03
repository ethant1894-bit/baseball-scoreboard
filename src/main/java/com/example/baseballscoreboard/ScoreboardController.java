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
import javafx.scene.transform.Scale;


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

        tm1Name.textProperty().bind(game.getTm1Name());
        tm2Name.textProperty().bind(game.getTm2Name());

        inningNumber.textProperty().bind(game.getInningNum());
        Scale flippedTriangle = new Scale(1, 1, inningPart.getBoundsInLocal().getMinX()
                + inningPart.getBoundsInLocal().getWidth() / 2, inningPart.getBoundsInLocal().getMinY() +
                inningPart.getBoundsInLocal().getHeight() / 2);
        inningPart.getTransforms().add(flippedTriangle);
        game.getTopOfInning().addListener((obs, oldValue, newValue) -> {
            flippedTriangle.setY(newValue ? -1 : 1);
        });

    }
}




