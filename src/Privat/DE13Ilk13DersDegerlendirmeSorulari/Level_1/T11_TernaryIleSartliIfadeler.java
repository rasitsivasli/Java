package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class T11_TernaryIleSartliIfadeler {
    public static void main(String[] args) {
        // klavyeden girilen iki sayı birbirine tam bölünebiliyormu bulunuz
        // bölen sıfırsa , hatalı giriş sıfıra bölünemez yazdırın
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bölünen sayiyi giriniz : ");
        int num1 = scanner.nextInt();
        System.out.print("Bölen sayiyi giriniz : ");
        int num2 = scanner.nextInt();

        String durum = num2 == 0 ? "Hatali giris, sayi 0 a bölünmez" : num1 % num2 == 0 ? "Sayilar birbirine tam bölünüyor" : "Sayilar birbirine tam bölünmüyor";
        System.out.println(durum);
    }
}
