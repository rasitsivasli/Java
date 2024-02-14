package CodeChallenges.Hafta6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {

/* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */


        System.out.print("Bir metin giriniz : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        tersMetinMetod2(str);
        tersMetinMetod(str);
    }

    private static void tersMetinMetod2(String str) {
        String [] yeniStr = str.split("");
        System.out.println("yeniStr = " + Arrays.toString(yeniStr));
        int n = yeniStr.length;
        System.out.print("Ters Metin mit Arrays : ");
        for (int i = n-1 ; i >= 0; i--) {
            System.out.print(yeniStr[i]);
        }

    }

    private static void tersMetinMetod(String str) {
        String strYeni = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            String ch = String.valueOf(str.charAt(i));
            strYeni += ch;

        }
        System.out.println("\nTers Metin : " + strYeni);
    }

}
