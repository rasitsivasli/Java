package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Ad ve soyad giriniz : ");
        String str = scan.nextLine();

        System.out.println(str.substring(0,1).toUpperCase());
        System.out.println(Character.toUpperCase(str.charAt(str.indexOf(' ')+1)));


    }
}
