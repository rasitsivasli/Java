package Privat.DE07_Concat;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Bir kelime giriniz : ");
        String str = scan.next();

        char ch = str.charAt(str.length()-1); // son harfi verir
        System.out.println(ch);



    }
}
