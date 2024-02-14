package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task02_TekrarCoz_IcIceIfElseIlee {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Password giriniz = ");
        String pasWord = scan.next();
        char ch = pasWord.charAt(0);
        System.out.println("ch = " + ch);

        if (ch>='A' && ch<='z') {
            if (Character.isDigit(pasWord.charAt(pasWord.length()-1))) {
                if (pasWord.length() >= 6) {
                    System.out.println("giris yapabilirsiniz");
                } else System.out.println("en az 6 karakterli bir Password giriniz");

            } else  System.out.println("Son karakter sayi degildir");


        } else System.out.println("Ilk harf büyük harf olmali..");


    }
}
