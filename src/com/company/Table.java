package com.company;



public class Table {
    private static int nbCol = 11;
    private static int nbLig = 10;
    private static char[][] grille;
    private static int[][] players;

    // Fonction pour Initialisé la grille
    public static void setupGrid(int nbPlayer) {
        grille = new char[nbLig][nbCol];
        players = new int[nbPlayer][2];
        for (int i = 0; i < nbPlayer; i++){
            if (i == 3){
                players[i][0] = 3;
            } else {
                players[i][0] = 4 + i;
            }
            players[i][1] = 5;
        }


        // For pour parcourir toute les colognes
        for (int l = 0; l < nbLig; l++) {
            // For pour parcourir toute les lignes
            for (int c = 0; c < nbCol; c++) {
                grille[l][c] = 'o';
            }
        }
        /**
         * Position de la personne
         *
         * Nombre de participant
         * Initial
         *
         * Players[0]
         * Players = [
         * [6, 5]
         * [6, 6]
         * [6, 7]
         * [6, 4]
         * ]
         */

    }
    public static void displayGrid() {
        ColorConsole.println("\n    A  B  C  D  E  F  G  H  I  J  K", Color.CYAN);
        char[][] cloneGrid = grille;
        char[] idPlayer = {'1','2','3','4'};

        for (int i = 0; i < players.length; i++ ){
            int l = players[i][0];
            int c = players[i][1];
            cloneGrid[l][c] = idPlayer[i];
        }

        // For pour parcourir toute les colognes
        for (int l = 0; l < nbLig; l++) {
            System.out.println();
            ColorConsole.print(String.valueOf(l+1), Color.CYAN);
            if (l < 9){
                System.out.print(" ");
            }
            // For pour parcourir toute les lignes
            for (int c = 0; c < nbCol; c++) {
                switch (cloneGrid[l][c]){
                    case '1':
                        ColorConsole.print("  " + cloneGrid[l][c], Color.RED);
                        break;
                    case '2':
                        ColorConsole.print("  " + cloneGrid[l][c], Color.CYAN);
                        break;
                    case '3':
                        ColorConsole.print("  " + cloneGrid[l][c], Color.BLUE);
                        break;
                    case '4':
                        ColorConsole.print("  " + cloneGrid[l][c], Color.YELLOW);
                        break;
                    default:
                        System.out.print("  " + cloneGrid[l][c]);
                }
            }
        }
    }
}
