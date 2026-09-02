package com.example.baseballscoreboard;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Game {
    private boolean team1turn = true;
    private SimpleStringProperty team1Points = new SimpleStringProperty(String.valueOf(0));
    private SimpleStringProperty team2Points = new SimpleStringProperty(String.valueOf(0));

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
