package CodeChallenges.Hafta2.Freitag;

import java.util.Scanner;

public class IfTask7 {

    public static void main(String[] args) {
        /* Task->
         * Girilen fiyat için
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * print eden code create ediniz
         */

        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen saati giriniz : ");
        double fiyat = scan.nextDouble();

        System.out.println(fiyat<10? "ucuz":(fiyat>=10 && fiyat<20? "normal":"pahali"));







    }
}
