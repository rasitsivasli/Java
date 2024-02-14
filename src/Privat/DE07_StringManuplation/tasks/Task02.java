package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task02 {
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

        if (Character.isUpperCase(pasWord.charAt(0)) && // ilk karakter büyük harf mi
                Character.isDigit(pasWord.charAt(pasWord.length() - 1)) && // karakter rakam mi diye soruyoruz
                pasWord.length() >= 6)

        {
            System.out.println("Password uygundur");
        } else System.out.println("password uygun degildir");


    }
}
