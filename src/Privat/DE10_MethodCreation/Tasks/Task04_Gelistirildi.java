package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task04_Gelistirildi {//amale köyden ırgat çağıran şeher
    /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
         */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bakiyenizi ögrenmek icin 1, Para yatirma ve cekme icin 2, Cikis icin 3 :  ");
        int secim = scanner.nextInt();
        int bakiye=1000;
        hesaplama(secim,bakiye);

    }//main dışı


    private static void hesaplama(int secim,int bakiye) {

        switch (secim) {
            case 1:
                System.out.println("Bakiyeniz = "+bakiye+" Eurodur");
                break;
            case 2:
                System.out.print("Yatirmak istediginiz miktari seciniz: 100--200--300 : ");
                Scanner input = new Scanner(System.in);
                int paraMiktari = input.nextInt();
                paraYatirmaCekme(paraMiktari,bakiye);
                break;
            case 3:
                System.out.println("Cikis yapildi...");
                break;
            default:
                System.out.println("Yanlis giris yaptiniz..");
                break;

        }
    }

    private static void paraYatirmaCekme(int paramiktari, int bakiye) {
        int yeniBakiye=0;
        switch (paramiktari) {
            case 100:
                yeniBakiye=bakiye+paramiktari;
                System.out.println("yeniBakiye = " + yeniBakiye);
                break;
            case 200:
                yeniBakiye=bakiye+paramiktari;
                System.out.println("yeniBakiye = " + yeniBakiye);
                break;
            case 300:
                System.out.println("Yeni bakiyeniz = "+(bakiye+paramiktari)+" Euro dur");
                yeniBakiye=bakiye+paramiktari;
                break;
            default:
                System.out.println("Yanlis giris yaptiniz..");
                break;

        }
        System.out.println("Bakiyenizi ögrenmek icin 1, Para yatirma ve cekme icin 2, Cikis icin 3 :  ");
        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        hesaplama(secim,bakiye);

    }
}