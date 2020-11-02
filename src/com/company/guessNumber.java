package com.company;
import java.util.Random;
import java.util.Scanner;

public class guessNumber {

    public static void playRandomNum() {

        Random rand = new Random();
        int randInt = rand.nextInt(100);
        Scanner scan = new Scanner(System.in);

        //System.out.println(randInt); => pour tester le jeu

        int T = 10;

        System.out.println("Guess a number in 10 trials :");

       for (int i=0; i<=T; i++){

           if (i == T){
               System.out.println("You don't have anymore try.");
               System.out.println("The number was "+randInt);
           }

           System.out.println("The number is between 0 and 100 :");
           int userInput = scan.nextInt();

           if (randInt == userInput){
               System.out.println("You win !");
               break;
           }
           else if(randInt<userInput && i != T-1){
               System.out.println("Smaller");
               System.out.println((T-i)+" "+"trials"+" "+"left");
           }
           else if (randInt>userInput && i != T-1){
               System.out.println("Bigger");
               System.out.println((T-i)+" "+"trials"+" "+"left");
           }
       }
        Main.main(null);
    }
}
