package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        do {
            number = Menu.choiceStart();
            if (number==1){
                int input = Menu.choiceNumberPlayer();
                numberPlayer nbPlayer= switch(input){
                    case 2->numberPlayer.TWO;
                    case 3->numberPlayer.THREE;
                    default ->numberPlayer.FOUR;
                };
                new Game(nbPlayer).play(input);
            }
            else if (number == 2){
                Menu.rulesOfTheGame();
            }
        } while (number == 2);
    }
}
