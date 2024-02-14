package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class T11_SayiyiYaziIleYazma {
    public static void main(String[] args) {
        /*
        klavyeden iki basamaklı bir sayı giriliyor, ekrana yazı ile yazdırın
        input : 27
        output: yirmi yedi
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num1 = scanner.nextInt();
        int birler = num1 % 10;
        int onlar = num1 / 10;
        String[] birlerBasamagi = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
        String[] onlarBasamagi = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};

        String yaziIleSayi = onlarBasamagi[onlar] + " " + birlerBasamagi[birler];
        System.out.println(yaziIleSayi);


    }
}
