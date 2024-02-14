package Privat.DE06_SwitchCase.tasks;


import java.util.Scanner;

public class SayiyiYaziylaYazdirma {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Bir sayı giriniz: ");
            int sayi = input.nextInt();
            input.close();

            String[] birler = {"", "Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", "Dokuz"};
            String[] onlar = {"", "On", "Yirmi", "Otuz", "Kırk", "Elli", "Altmış", "Yetmiş", "Seksen", "Doksan"};

            if (sayi >= 1 && sayi <= 99) {
                int birlerBasamagi = sayi % 10;
                int onlarBasamagi = sayi / 10;

                String sayiYazi = onlar[onlarBasamagi] + " " + birler[birlerBasamagi];
                System.out.println(sayiYazi);
            } else {
                System.out.println("Lütfen 1 ile 99 arasında bir sayı giriniz.");
            }
        }
    }

