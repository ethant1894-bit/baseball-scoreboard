package com.example.baseballscoreboard;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;

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
    public void initialize() {

    }

    // Console Methods
    private void addXtoScore(int addition) {
        if (Game.isTeam1turn()) {
            Game.setTeam1Points(Game.getTeam1Points() + addition);
        } else {
            Game.setTeam1Points(Game.getTeam1Points() + addition);
        }
        tm1Score.setText(String.valueOf(team1Points));
        tm2Score.setText(String.valueOf(team2Points));
        consoleTm1Score.setText(String.valueOf(team1Points));
        consoleTm2Score.setText(String.valueOf(team2Points));
        team1turn = !team1turn;
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
}
