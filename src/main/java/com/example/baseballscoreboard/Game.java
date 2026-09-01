package com.example.baseballscoreboard;

public class Game {
    private static boolean team1turn = true;
    private static int team1Points = 0;
    private static int team2Points = 0;

    public static int getTeam2Points() {
        return team2Points;
    }

    public static void setTeam2Points(int team2Points) {
        Game.team2Points = team2Points;
    }

    public static int getTeam1Points() {
        return team1Points;
    }

    public static void setTeam1Points(int team1Points) {
        Game.team1Points = team1Points;
    }

    public static boolean isTeam1turn() {
        return team1turn;
    }

    public static void setTeam1turn(boolean team1turn) {
        Game.team1turn = team1turn;
    }
}
