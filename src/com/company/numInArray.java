package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class numInArray {


    public static int findIndex(int array[], int array2[], int array3[], int t){
        if (array == null){
            return -1;
        }
        int i=0;
        int j=0;
        int k=0;

        while (i< array.length){
            if (array[i] == t){
                return i;
            }
            else if (array2[j] == t){
                return j;
            }
            else if (array3[k] == t){
                return k;
            }

            else {
                i++;
                j++;
                k++;
            }
        }
        return -1;
    }

    public static void numInArrayGame(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter 5 numbers :");

        //int input = sc.nextInt();

        int[]array = new int[5];
        int[]array2 = new int[5];
        int[]array3 = new int[5];


        System.out.println("Tableau 1 :");
        for (int i=0; i< array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Tableau 2 :");
        for (int j=0; j<array2.length; j++){
            array2[j] = sc.nextInt();
        }

        System.out.println("Tableau 3 :");
        for (int k=0; k<array3.length; k++){
            array3[k] = sc.nextInt();
        }


        System.out.println("Array elements are :");

        for (int i=0; i< array.length; i++){
            System.out.print(" "+array[i]+" ");
        }

        System.out.println(" ");

        for (int j=0; j<array2.length; j++){
            System.out.print(" "+array2[j]+" ");
        }

        System.out.println(" ");

        for (int k=0; k< array3.length; k++){
            System.out.print(" "+array3[k]+" ");
        }

        System.out.println("");
        System.out.println("Le chiffre 7 se trouve à l'index "+findIndex(array, array2, array3, 7));

    }
}
