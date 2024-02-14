package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class T06_SwitchIleStringidekiRakamlarlaIslemYapma_REGEXiLE {
    public static void main(String[] args) {
        /* String str= "20+8" şeklinde bir strin geriliyor bu string 2 sayı ve ortasında bir
        matematiksel işlemden oluşmaktadır, ortasındaki matematiksel işleme göre işlemi yapıp sonucu yazdırın
        output: = 20+8 = 28
        ortasındaki işlem 4 işlemin yanı sıra  "<" = küçüğünü bul, ">" büyüğünü bul işlemide olabilir
        switch  kullanın, case içerisinde ise her bir işlem için bir metot olsun

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        String str = scanner.next();//20+9
        String isaret = str.replaceAll("\\w", "");// harfler ve RAKAMLARI siler
        //String isaret = str.replaceAll("\\d", "");// tum sayilari siler
        //String isaret = str.replaceAll("[0-9]", "");// tum rakamlari siler
        System.out.println("str = " + str);

        switch (isaret) {
            case "+":
                System.out.println("Sayilarin toplami : " + (Integer.valueOf(str.substring(0, str.indexOf("+"))) +
                        Integer.valueOf(str.substring(str.indexOf("+") + 1))));
                break;
            case "-":
                System.out.println("Sayilarin farki : " + ((Integer.valueOf(str.substring(0, str.indexOf("-")))) -
                        (Integer.valueOf(str.substring(str.indexOf("-") + 1)))));
                break;
            case "*":
                System.out.println("Sayilarin carpimi : " + Integer.valueOf(str.substring(0, str.indexOf("*"))) *
                        Integer.valueOf(str.substring(str.indexOf("*") + 1)));
                break;
            case "/":
                System.out.println("Sayilarin bölümü : " + Integer.valueOf(str.substring(0, str.indexOf("/"))) /
                        Integer.valueOf(str.substring(str.indexOf("/") + 1)));
                break;
            case ">":
                System.out.println("Sayilardan büyük olani : " + str.substring(0, str.indexOf(">")));
                break;
            case "<":
                System.out.println("Sayilardan kücük olani : " + str.substring(0, str.indexOf("<")));
                break;
            default:
                System.out.println("Yanlis giris yaptiniz...");
        }

    }
}
