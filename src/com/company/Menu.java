package com.company;
import java.util.Scanner;

public class  Menu {
    /**
     * affiche le menu démarrer
     * @return le choix de l'utilisateur sous forme d'index
     */
    static int choiceStart(){
        ColorConsole.println("\n*********************************************************", Color.GREEN);
        ColorConsole.println("*                                                       *", Color.GREEN);
        ColorConsole.println("*            Bienvenue sur CASSE LA TETE                *", Color.RED);
        ColorConsole.println("*                                                       *", Color.GREEN);
        ColorConsole.println("*********************************************************", Color.GREEN);
        ColorConsole.println("\n\t1 : Nouvelle Partie ", Color.BLUE);
        ColorConsole.println("\t2 : Affichez les règles", Color.BLUE);
        ColorConsole.println("\t3 : Quittez la partie", Color.BLUE);
        ColorConsole.print("\nEntrer votre choix: ", Color.GREEN);
        return askInput(3,0);
    }

    /**
     * affiche le menu de choix de difficulté
     * @return le niveau de difficulté sous forme d'index
     */
    static int choiceNumberPlayer() {
        ColorConsole.print("Combien de joueurs 2 à 4 : ", Color.BLUE);
        return askInput(4, 1);


    }
    public static void rulesOfTheGame() { // Affichage dans la console des règles
        System.out.println(("Bonjour et Bienvenue dans Casse La Tete ! Voici les règles du jeu : \n\n") +
                        "Au début de la partie, votre pion sera placé à côté de celui de votre adversaire, le but est simple, gagner la partie en bloquant au maximum votre ennemi.\n" +
                        "Vous jouerez tour à tour et vous disposerez de 15 secondes pour jouer le vôtre.\n" +
                        "A chaque tours vous devrez déplacer soit horizontalement soit verticalement votre pion, puis, vous devrez détruire une case sur le plateau\n" +
                        "Le premier pion étant bloqué par une case au dessus, une case en dessous, une case à droite et une case à gauche aura perdu !\n" +
                        "Choisissez bien vos déplacements ! Vous êtes prêt ? A vos marques, Prêt ? Jouez !"
        );

    }

    /**
     * sécurité pour ne pas faire crash le programme
     * @param max désigne le max d'input possible
     * @return une valeur valable
     */
    static int askInput(int max, int choice){
        Scanner scan=new Scanner(System.in);
        try {
            int nextInt = scan.nextInt();
            if(nextInt > max || nextInt <= choice){
                throw new Exception();
            }
            return nextInt;
        }
        catch (Exception e){
            ColorConsole.println("Entrer incorrecte",Color.RED);
            ColorConsole.print("Entrer votre choix : ", Color.GREEN);
            return askInput(max, choice);
        }
    }

}
