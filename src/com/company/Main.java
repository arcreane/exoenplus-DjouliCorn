package com.company;
import com.company.guessNumber;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose your game :");
        System.out.println("1 : Guess a number");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5 : Exit");

        choice = input.nextInt();

        switch (choice) {
            case 1:
                guessNumber.playRandomNum();
            case 2:
                //jeu 2
            case 3:
                //jeu 3
            case 4:
                //jeu 4
            case 5:
                //quit
            default:
                System.out.println("Je n'ai pas compris votre demande");
                Main.main(null);

        }
    }
}
