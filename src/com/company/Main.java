package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice;
        Scanner input = new Scanner(System.in);
        boolean waitingForAnswer = true;

        System.out.println("Choose your game :");
        System.out.println("1 : Guess a number");
        System.out.println("2 : The palindrome");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5 : Exit");

        while (waitingForAnswer) {

            try {
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        guessNumber.playRandomNum();
                    case 2:
                        palindrome.palindromeGame();
                    case 3:
                        numInArray.numInArrayGame();
                    case 4:
                        //jeu 4
                    case 5:
                        //quit
                        System.exit(0);
                }
                System.out.println("I don't understand, please try again.");
                System.out.println(" ");
                Main.main(null);
            } catch (Exception e){
                System.out.println("I don't understand, please try again.");
                System.out.println(" ");
                Main.main(null);
            }
        }

    }
}
