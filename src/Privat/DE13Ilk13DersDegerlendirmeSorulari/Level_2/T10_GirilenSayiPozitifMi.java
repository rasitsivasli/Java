package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class T10_GirilenSayiPozitifMi {
    /*  Klavyeden girilen bir sayının pozitif,  negatif veya sıfır olduğunu bulup ekrana yazdırın
    (if ve ternary kullanılmayacak) switch ile yapılacak
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num1 = Integer.compare(scanner.nextInt(), 0);


        switch (num1) {// compare sayiyi 0 ile kiyaslar o dan kücük ise -1, 0 dan buyuk ise 1, esitse 0 veriyor.
            case -1:
                System.out.println("Girilen sayı negatif.");
                break;
            case 0:
                System.out.println("Girilen sayı sıfır.");
                break;
            case 1:
                System.out.println("Girilen sayı pozitif.");
                break;
            default:
                System.out.println("Geçersiz sayı.");
        }
    }
}
