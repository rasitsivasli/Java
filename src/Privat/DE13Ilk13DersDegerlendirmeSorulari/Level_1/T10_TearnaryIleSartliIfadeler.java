package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class T10_TearnaryIleSartliIfadeler {
    // Klavyeden girilen bir sayının pozitif veya negatif olduğunu bulup ekrana yazdırın
    // ( 0 ise hatalı giriş yazdırın)
    // a) if kullanrak çözün
    // b) ternary kullanarak çözün ( tek ternary işlemi )
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num = scanner.nextInt();


        String durum = num == 0 ? "Hatali giris yaptiniz" : num > 0 ? "Sayi pozitiftir" : "Sayi negatiftir";
        System.out.println(durum);
    }
}
