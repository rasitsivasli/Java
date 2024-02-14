package Privat.DE03_04OperatorsAndMathClass.AritmeticOperator.tasks;

import java.util.Scanner;

public class Task08 {
    /*Task->
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.print("Saniyeyi giriniz : ");

        int sa= scan.nextInt();
        int saat = sa/3600;
        int dk= (sa%3600)/60;
        int saniye = sa%60 ;

        System.out.println(saat+" saat "+dk+" dakika "+saniye+" saniye");

    }
}
