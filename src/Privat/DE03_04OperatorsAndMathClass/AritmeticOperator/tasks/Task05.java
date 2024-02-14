package Privat.DE03_04OperatorsAndMathClass.AritmeticOperator.tasks;

import java.util.Scanner;

public class Task05 {

    /*
    Task->
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Saati giriniz : ");
        int sa= scan.nextInt();
        System.out.print("Dakikayi giriniz : ");
        int dk= scan.nextInt();
        System.out.print("Saniyeyi giriniz : ");
        int sn= scan.nextInt();
        int sure = 3600*sa+60*dk+sn;

        System.out.println("Toplam saniye : "+sure);










    }

}



























