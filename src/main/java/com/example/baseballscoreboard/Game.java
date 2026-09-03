package com.example.baseballscoreboard;

import javafx.beans.property.*;

public class Game {
    private boolean team1turn = true;

    // Score, BSO
    private final SimpleStringProperty team1Points = new SimpleStringProperty(String.valueOf(0));
    private final SimpleStringProperty team2Points = new SimpleStringProperty(String.valueOf(0));
    private final SimpleStringProperty balls = new SimpleStringProperty(String.valueOf(0));
    private final SimpleStringProperty strikes = new SimpleStringProperty(String.valueOf(0));
    private final SimpleStringProperty outs = new SimpleStringProperty(String.valueOf(0));

    // Bases (using properties to update info live on scoreboard and console)
    private final SimpleBooleanProperty firstBase = new SimpleBooleanProperty(false);
    private final SimpleBooleanProperty secondBase = new SimpleBooleanProperty(false);
    private final SimpleBooleanProperty thirdBase = new SimpleBooleanProperty(false);


    // Team Names
    private final SimpleStringProperty tm1Name = new SimpleStringProperty("TM1");
    private final SimpleStringProperty tm2Name = new SimpleStringProperty("TM2");

    // Inning Control
    private final SimpleStringProperty inningNum = new SimpleStringProperty(String.valueOf(1));
    private final SimpleBooleanProperty topOfInning = new SimpleBooleanProperty(true);

    public SimpleBooleanProperty getTopOfInning() {
        return topOfInning;
    }

    public boolean isTopOfInning() {
        return topOfInning.get();
    }

    public void setTopOfInning() {
        this.topOfInning.set(!getTopOfInning().get());
    }

    public SimpleStringProperty getInningNum() {
        return inningNum;
    }

    public void setInningNum(int inning) {
        if (inning >= 0) {
            this.inningNum.set(String.valueOf(inning));
        }
    }

    public SimpleStringProperty getTm1Name() {
        return tm1Name;
    }

    public void setTm1Name(String newName) {
        this.tm1Name.set(newName);
    }

    public SimpleStringProperty getTm2Name() {
        return tm2Name;
    }

    public void setTm2Name(String newName) {
        this.tm2Name.set(newName);
    }

    public SimpleBooleanProperty getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(boolean b) {
        this.firstBase.set(b);
    }

    public SimpleBooleanProperty getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(boolean b) {
        this.secondBase.set(b);
    }

    public SimpleBooleanProperty getThirdBase() {
        return thirdBase;
    }

    public void setThirdBase(boolean b) {
        this.thirdBase.set(b);
    }

    public SimpleStringProperty getOuts() {
        return outs;
    }

    public void setOuts(int outsInt) {
        if (outsInt <= 3 && outsInt >= 0) {
            this.outs.set(String.valueOf(outsInt));
        }

    }

    public SimpleStringProperty getBalls() {
        return balls;
    }

    public void setBalls(int ballsInt) {
        if (ballsInt <= 4 && ballsInt >= 0) {
            this.balls.set(String.valueOf(ballsInt));
        }
    }

    public SimpleStringProperty getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikesInt) {
        if (strikesInt <= 3 && strikesInt >= 0) {
            this.strikes.set(String.valueOf(strikesInt));
        }
    }


    public SimpleStringProperty getTeam2Points() {
        return team2Points;
    }

    public void setTeam2Points(int team2PointsInt) {
        if (team2PointsInt >= 0) {
            this.team2Points.set(String.valueOf(team2PointsInt));
        }
    }

    public SimpleStringProperty getTeam1Points() {
        return team1Points;
    }

    public void setTeam1Points(int team1PointsInt) {
        if (team1PointsInt >= 0) {
            this.team1Points.set(String.valueOf(team1PointsInt));
        }
    }

    public boolean isTeam1turn() {
        return team1turn;
    }

    public void setTeam1turn(boolean team1turn) {
        this.team1turn = team1turn;
    }
}
