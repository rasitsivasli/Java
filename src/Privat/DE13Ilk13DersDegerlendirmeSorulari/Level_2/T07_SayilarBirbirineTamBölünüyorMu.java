package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class T07_SayilarBirbirineTamBölünüyorMu {
    public static void main(String[] args) {
        // klavyeden girilen iki sayı birbirine tam bölünebiliyormu bulunuz
        // bölen sıfırsa , hatalı giriş sıfıra bölünemez yazdırn ve yeni sayı istesin
        // 0 dan farklı bir bölen girene kadar da işlem devam etsin

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bölünen sayiyi giriniz : ");
        int num1 = scanner.nextInt();
        System.out.print("Bölen sayiyi giriniz : ");
        int num2 = scanner.nextInt();

        while (num2 == 0) {
            System.out.println("Bolen 0 olamaz, bölen sayiyi tekrara sayi giriniz");
            num2 = scanner.nextInt();
        }
            if (num1 % num2 == 0) {
                System.out.println("Sayilar birbirine tam bölünüyor");
            } else {
                System.out.println("Sayilar birbirine tam bölünüyor");

            }

        }


    }

