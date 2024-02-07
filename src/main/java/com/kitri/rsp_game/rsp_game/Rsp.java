package com.kitri.rsp_game.rsp_game;

public class Rsp {
    String you;
    String computer;

    public Rsp(String you, String computer) {
        this.you = you;
        this.computer = computer;
    }

    public String getYou() {
        return you;
    }

    public void setYou(String you) {
        this.you = you;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }
}
