package Privat.DE07_StringManuplation.tasks02;

import java.util.Scanner;

public class Task02_05 {
    public static void main(String[] args) {
        //// "ad soyad" veriliyor, "soyad ad" şekline dönderin

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi giriniz : ");
        String str = scanner.nextLine();

        String ad= str.substring(0,str.indexOf(" "));
        System.out.println("ad = " + ad);

        String soyAd= str.substring(str.indexOf(" ")+1);
        System.out.println("ad = " + soyAd);

        System.out.println(soyAd.substring(0).toUpperCase()+" "+ad.substring(0).toUpperCase());


    }
}
