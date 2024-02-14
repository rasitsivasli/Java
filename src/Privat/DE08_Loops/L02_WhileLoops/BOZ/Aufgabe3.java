package Privat.DE08_Loops.L02_WhileLoops.BOZ;

import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {

        // verilen Stringi ters ceviren method olusuturun

        String str = "Sizin oralarda havalar nasil";
        tersMetin(str);

    }

    private static void tersMetin(String metin) {

        int i = metin.length() - 1;
        String strTers = "";
        char ch;

        while (i >= 0) {

            ch = metin.charAt(i);
            strTers += ch;

            i--;
        }
        System.out.println("strTers = " + strTers);


    }
}
