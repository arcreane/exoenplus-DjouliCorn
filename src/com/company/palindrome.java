package com.company;
import java.util.Scanner;

public class palindrome {

    public static void palindromeGame(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word :");
        String input = sc.nextLine();
        int length = input.length();

        boolean isPalindrome = true;

        for (int i=0; i<length; i++){
            if (input.charAt(i) != input.charAt(length-1-i)){
                System.out.println(input+" "+"is not a palindrome.");
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println(input+" "+"is a palindrome.");
        }




    }
}
