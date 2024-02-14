package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //Task -> verilen bir long tam sayinin rakamlari toplamini print eden code create ediniz


     

        System.out.println("bizim oolann bi sayi gir bakennn : ");
        long random = (long) (Math.random()*1000000000);
        System.out.println("random sayi : "+random);
        int toplam = 0;
        String str=random+""; // long sayiyi string yaptik..

        for (int i = 0; i < str.length(); i++) {

            int herbirBasamak = Integer.parseInt(str.substring(i,i+1));
            toplam+=herbirBasamak;

        }
        System.out.println("toplam = " + toplam);

        /// 2. yol

        toplam = 0;
        long sayi2=random;// sayinin degismemesi icin baska bir sayi tanimladik
        for (int i = 0; 0 < sayi2; i++) {
            int rakam = (int) (sayi2%10);
            toplam+=rakam;
            sayi2=sayi2/10;

        }
        System.out.println(toplam);
    }
}
