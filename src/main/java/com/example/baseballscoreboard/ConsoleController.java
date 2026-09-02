package com.example.baseballscoreboard;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;

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

    private Game game;

    public void setGame(Game gameModel) {
        this.game = gameModel;
        consoleTm1Score.textProperty().bind(game.getTeam1Points());
        consoleTm2Score.textProperty().bind(game.getTeam2Points());
        consoleBallCount.textProperty().bind(game.getBalls());
        consoleStrikeCount.textProperty().bind(game.getStrikes());
        consoleOutCount.textProperty().bind(game.getOuts());
    }

    // Console Methods
    // TODO: Add proper error checking through try/catch
    private void addXtoScore(int addition) throws IOException {
        if (game.isTeam1turn()) {
            game.setTeam1Points(Integer.parseInt(game.getTeam1Points().get()) + addition);
        } else {
            game.setTeam2Points(Integer.parseInt(game.getTeam2Points().get()) + addition);
        }
    }

    @FXML
    public void plusOneButtonF() throws IOException {
        addXtoScore(1);
    }

    @FXML
    public void plusTwoButtonF() throws IOException {
        addXtoScore(2);
    }

    @FXML
    public void plusThreeButtonF() throws IOException {
        addXtoScore(3);
    }

    @FXML
    public void plusFourButtonF() throws IOException {
        addXtoScore(4);
    }

    @FXML
    public void minusOneButtonF() throws IOException {
        addXtoScore(-1);
    }

    @FXML
    public void minusTwoButtonF() throws IOException {
        addXtoScore(-2);
    }

    @FXML
    public void minusThreeButtonF() throws IOException {
        addXtoScore(-3);
    }

    @FXML
    public void minusFourButtonF() throws IOException {
        addXtoScore(-4);
    }

    @FXML
    public void tm1OnOffense() {
        game.setTeam1turn(true);
    }

    @FXML
    public void tm2OnOffense() {
        game.setTeam1turn(false);
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

}
