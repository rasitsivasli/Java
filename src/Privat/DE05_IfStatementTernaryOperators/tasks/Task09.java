package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");

        int sayi = scan.nextInt();


        if (sayi < 0) {
            System.out.println("Sayi negatif");
        }
        else  System.out.println("Sayi pozitif");
    }
}
