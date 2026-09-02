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
        this.outs.set(String.valueOf(outsInt));
    }

    public SimpleStringProperty getBalls() {
        return balls;
    }

    public void setBalls(int ballsInt) {
        this.balls.set(String.valueOf(ballsInt));
    }

    public SimpleStringProperty getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikesInt) {
        this.strikes.set(String.valueOf(strikesInt));
    }


    public SimpleStringProperty getTeam2Points() {
        return team2Points;
    }

    public void setTeam2Points(int team2PointsInt) {
        this.team2Points.set(String.valueOf(team2PointsInt));
    }

    public SimpleStringProperty getTeam1Points() {
        return team1Points;
    }

    public void setTeam1Points(int team1PointsInt) {
        this.team1Points.set(String.valueOf(team1PointsInt));
    }

    public boolean isTeam1turn() {
        return team1turn;
    }

    public void setTeam1turn(boolean team1turn) {
        this.team1turn = team1turn;
    }
}
