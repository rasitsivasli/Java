package CodeChallenges.Hafta2.Freitag;

import java.util.Scanner;

public class IfTask10 {
    public static void main(String[] args) {

        //Verilen String cent miktarını 123 1$ dolar 23 cent şeklinde yazdırın
//
//        Scanner scan =new Scanner(System.in);
//        System.out.print("Cent miktarini giriniz : ");
//        int cent= scan.nextInt();
//        int dolar = (cent/100);
//        int cent2 = cent%100;

//        System.out.println(dolar+" dolar "+cent2+ " Cent");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cent giriniz : ");
        int cent = scanner.nextInt();
        int dolar;
        if (cent >= 100) {
            dolar = (cent / 100);
            cent = cent % 100;
            System.out.println(dolar + " $ " + cent + " cent");
        } else {
            System.out.println(cent + " cent");

//


        }
    }
}

