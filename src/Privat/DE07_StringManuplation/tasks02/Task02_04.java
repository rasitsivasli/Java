package Privat.DE07_StringManuplation.tasks02;

import java.util.Scanner;

public class Task02_04 {
    public static void main(String[] args) {
        // "ad soyad" şeklinde string veriliyor,  soy ad içierisinde ki ilk
       // "e" harfinin indexini bulun
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi giriniz : ");
        String str = scanner.nextLine();


        System.out.println(str.indexOf("e",str.indexOf(" ")+1));// soyad icersinde ilk e harfi




    }
}
