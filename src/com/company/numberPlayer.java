package com.company;

public enum numberPlayer {

    TWO(2),
    THREE(3),
    FOUR(4);
    final int numberOfPlayer;

    numberPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }
}
