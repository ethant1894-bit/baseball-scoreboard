package com.example.baseballscoreboard;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;

import java.io.IOException;

public class ConsoleController {
    // Console Elements

    @FXML
    private Button minusFourButton;

    @FXML
    private Button minusThreeButton;

    @FXML
    private Button minusTwoButton;

    @FXML
    private Button minusOneButton;

    @FXML
    private Button plusOneButton;

    @FXML
    private Button plusTwoButton;

    @FXML
    private Button plusThreeButton;

    @FXML
    private Button plusFourButton;

    @FXML
    private MenuButton teamSelect;

    @FXML
    private MenuItem tm1Select;

    @FXML
    private MenuItem tm2Select;

    @FXML
    private Button ballButton;

    @FXML
    private Button strikeButton;

    @FXML
    private Button outButton;

    @FXML
    private Button removeBall;

    @FXML
    private Button removeStrike;

    @FXML
    private Button removeOut;

    @FXML
    private Text consoleBallCount;

    @FXML
    private Text consoleStrikeCount;

    @FXML
    private Text consoleOutCount;

    @FXML
    private Button firstBaseButton;

    @FXML
    private Button secondBaseButton;

    @FXML
    private Button thirdBaseButton;

    @FXML
    private Button resetBases;

    @FXML
    private Text consoleTm1Name;

    @FXML
    private Text consoleTm2Name;

    @FXML
    private Text consoleTm1Score;

    @FXML
    private Text consoleTm2Score;

    @FXML
    private TextField tm1NameField;

    @FXML
    private TextField tm2NameField;

    @FXML
    private Button setNameButton;

    @FXML
    private Polygon consoleInningIndicator;

    @FXML
    private Text consoleInningNumber;

    @FXML
    private Button addInning;

    @FXML
    private Button inningChangeToggle;

    @FXML
    private Button removeInning;

    @FXML
    private MenuButton selectBatter;

    @FXML
    private Button addHit;

    @FXML
    private Button removeHit;

    @FXML
    private Button addAtBat;

    @FXML
    private Button removeAtBat;

    @FXML
    private MenuButton selectPitcher;


    @FXML
    private Button addPitch;

    @FXML
    private Button removePitch;

    @FXML
    private TextArea batterStats;

    @FXML
    private TextArea pitcherStats;

    @FXML
    private Button resetCount;

    @FXML
    private Button resetOuts;

    private Game game;

    // Base Toggle Colours
    Background onBaseBG = new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY));
    Background notOnBaseBG = new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY));

    public void setGame(Game gameModel) {
        this.game = gameModel;
        consoleTm1Score.textProperty().bind(game.getTeam1Points());
        consoleTm2Score.textProperty().bind(game.getTeam2Points());
        consoleBallCount.textProperty().bind(game.getBalls());
        consoleStrikeCount.textProperty().bind(game.getStrikes());
        consoleOutCount.textProperty().bind(game.getOuts());
        firstBaseButton.backgroundProperty().bind(Bindings.when(game.getFirstBase()).then(onBaseBG).otherwise(notOnBaseBG));
        secondBaseButton.backgroundProperty().bind(Bindings.when(game.getSecondBase()).then(onBaseBG).otherwise(notOnBaseBG));
        thirdBaseButton.backgroundProperty().bind(Bindings.when(game.getThirdBase()).then(onBaseBG).otherwise(notOnBaseBG));
        consoleTm1Name.textProperty().bind(game.getTm1Name());
        consoleTm2Name.textProperty().bind(game.getTm2Name());

        tm1Select.textProperty().bind(game.getTm1Name());
        tm2Select.textProperty().bind(game.getTm2Name());

        consoleInningNumber.textProperty().bind(game.getInningNum());
        Scale flippedTriangle = new Scale(1, 1, consoleInningIndicator.getBoundsInLocal().getMinX()
                + consoleInningIndicator.getBoundsInLocal().getWidth() / 2, consoleInningIndicator.getBoundsInLocal().getMinY() +
                consoleInningIndicator.getBoundsInLocal().getHeight() / 2);
        consoleInningIndicator.getTransforms().add(flippedTriangle);
        game.getTopOfInning().addListener((obs, oldValue, newValue) -> {
            flippedTriangle.setY(newValue ? -1 : 1);
        });
    }

    // Console Methods
    private void addXtoScore(int addition) {
        if (game.isTeam1turn()) {
            game.setTeam1Points(Integer.parseInt(game.getTeam1Points().get()) + addition);
        } else {
            game.setTeam2Points(Integer.parseInt(game.getTeam2Points().get()) + addition);
        }
    }

    @FXML
    public void plusOneButtonF() {
        addXtoScore(1);
    }

    @FXML
    public void plusTwoButtonF() {
        addXtoScore(2);
    }

    @FXML
    public void plusThreeButtonF() {
        addXtoScore(3);
    }

    @FXML
    public void plusFourButtonF() {
        addXtoScore(4);
    }

    @FXML
    public void minusOneButtonF() {
        addXtoScore(-1);
    }

    @FXML
    public void minusTwoButtonF() {
        addXtoScore(-2);
    }

    @FXML
    public void minusThreeButtonF() {
        addXtoScore(-3);
    }

    @FXML
    public void minusFourButtonF() {
        addXtoScore(-4);
    }

    @FXML
    public void tm1OnOffense() {
        game.setTeam1turn(true);
        teamSelect.setText(game.getTm1Name().get());
    }

    @FXML
    public void tm2OnOffense() {
        game.setTeam1turn(false);
        teamSelect.setText(game.getTm2Name().get());
    }

    private void addOrRemoveBall(int number) {
        game.setBalls(Integer.parseInt(game.getBalls().getValue()) + number);
    }

    @FXML
    public void addBall() {
        addOrRemoveBall(1);
    }

    @FXML
    public void removeBall() {
        addOrRemoveBall(-1);
    }

    private void addOrRemoveStrike(int number) {
        game.setStrikes(Integer.parseInt(game.getStrikes().getValue()) + number);
    }

    @FXML
    public void addStrike() {
        addOrRemoveStrike(1);
    }

    @FXML
    public void removeStrike() {
        addOrRemoveStrike(-1);
    }

    private void addOrRemoveOuts(int number) {
        game.setOuts(Integer.parseInt(game.getOuts().getValue()) + number);
    }

    @FXML
    public void addOut() {
        addOrRemoveOuts(1);
    }

    @FXML
    public void removeOut() {
        addOrRemoveOuts(-1);
    }

    @FXML
    public void resetCount() {
        game.setBalls(0);
        game.setStrikes(0);
    }

    @FXML
    public void resetOuts() {
        game.setOuts(0);
    }

    private void toggleBase(int base) {
        if (base == 1) {
            game.setFirstBase(!game.getFirstBase().get());
        } else if (base == 2) {
            game.setSecondBase(!game.getSecondBase().get());
        } else if (base == 3) {
            game.setThirdBase(!game.getThirdBase().get());
        }
    }

    @FXML
    public void toggleFirstBase() {
        toggleBase(1);
    }

    @FXML
    public void toggleSecondBase() {
        toggleBase(2);
    }

    @FXML
    public void toggleThirdBase() {
        toggleBase(3);
    }

    @FXML
    public void resetBases() {
        game.setFirstBase(false);
        game.setSecondBase(false);
        game.setThirdBase(false);
    }

    @FXML
    public void setNames() {
        String tm1NameValue = tm1NameField.getText();
        String tm2NameValue = tm2NameField.getText();
        if (!tm1NameValue.isEmpty() && tm1NameValue.length() < 4) {
            game.setTm1Name(tm1NameValue);
        } if (!tm2NameValue.isEmpty() && tm2NameValue.length() < 4) {
            game.setTm2Name(tm2NameValue);
        }
        tm1NameField.clear();
        tm2NameField.clear();
    }

    private void inningAdjust(int number) {
        game.setInningNum(Integer.parseInt(game.getInningNum().getValue()) + number);
    }

    @FXML
    public void inningUp() {
        inningAdjust(1);
    }

    @FXML
    public void inningDown() {
        inningAdjust(-1);
    }

    @FXML
    public void changeInning() {
        game.setTopOfInning();
    }
}
