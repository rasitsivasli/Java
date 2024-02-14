package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class BirSayininRakamlarininToplami_Mod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        int yuzlerBasamagi = sayi / 100;
        int onlarBasamagi = (sayi % 100) / 10;
        int birlerBasamagi = sayi % 10;
        boolean deger = sayi > 99 && sayi < 1000;
        if (deger) {
            System.out.println("sayinin rakamlari toplami : " + (yuzlerBasamagi + onlarBasamagi + birlerBasamagi));
        }else {
            System.out.println("sen okudugunu anlamiyorsun galiba, 3 basamakli dedik sana, tekrar dene bitte");
        }
    }
}
