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
    private TextArea batterStats;

    @FXML
    private TextArea pitcherStats;

    @FXML
    private MenuButton selectPitcher;

    @FXML
    private Button addPitch;

    @FXML
    private Button removePitch;
}
