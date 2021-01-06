package com.company;

public class Game {


    numberPlayer numberplayer;



    public Game(numberPlayer numberplayer) {
        this.numberplayer=numberplayer;
    }

    /**
     * nombre de round et affichage du game over et du score
     */

    /**
     * arrayList []
     * ----------
     * ----------
     * ----------
     * ----------
     * -----x----
     * ----------
     * ----------
     *
     *
     *
     *
     *
     */
    public void play(int nbPlayer) {
        Table.setupGrid(nbPlayer);
        Table.displayGrid();
    }



}
