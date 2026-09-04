package com.example.baseballscoreboard;

public class Player {
    private String name;
    private String position;
    private int age;
    private int atBats;
    private int hits;

    public Player(String name, String position, int age, int atBats, int hits) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.atBats = atBats;
        this.hits = hits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
}
