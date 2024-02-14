package Privat.DE10_MethodCreation.Tasks;


import java.util.Scanner;

public class Task16_KelimeOyunu01 {

    public static void main(String[] args) {

        /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      *   Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
         */

        kelimeOyunu();


    }

    private static void kelimeOyunu() {
        Scanner scanner = new Scanner(System.in);
        int ikinciOyuncuPuani = 0;
        int birinciOyuncuPuani = 0;
        String kelime = "";


        while (true) {
            System.out.print("Birinci oyuncu bir kelime giriniz : ");
            String kelimeBirinciOyuncu = scanner.next();
            System.out.print("Ikinci oyuncu kelimeyi onayliyormusunuz? : ");
            String onay = scanner.next();
            if (onay.equalsIgnoreCase("evet")) {
                ikinciOyuncuPuani += kelime.length();
                kelime += kelimeBirinciOyuncu;
            } else {
                System.out.println("Gecersiz kelime, ikinci oyuncu kazanmistir.. ");
                break;
            }
        }
        System.out.println("Oyuna devam etmek istiyor musunuz : ");
        String devam = scanner.next();

        if (devam.equalsIgnoreCase("evet")) {
            System.out.println("Kelime ekleyin ");
            String ekKelime = scanner.next();
            System.out.println("Kelime basa mi sona mi eklensin");
            String basaMiSonaMi = scanner.next();
            if (basaMiSonaMi.equalsIgnoreCase("basa")) {
                kelime = basaMiSonaMi + kelime;
            } else {
                kelime += basaMiSonaMi;
            }
        } else
            System.out.println("Oyun Bitti");
        System.out.println("birinciOyuncuPuani = " + birinciOyuncuPuani);
        System.out.println("ikinciOyuncuPuani = " + ikinciOyuncuPuani);
    }


}

