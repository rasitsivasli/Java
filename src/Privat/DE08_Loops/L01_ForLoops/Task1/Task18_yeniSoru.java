package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task18_yeniSoru {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        //// bir sayi baska bir sayinin 3 müdür
        boolean baskaBirSayininKupuMu = false;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0 && i * i * i == sayi) {

                baskaBirSayininKupuMu = true;
            }

        }
        if (baskaBirSayininKupuMu) {
            System.out.println("baska bir sayinin küpüdür..");

        } else System.out.println("baska bir sayinin küpü degildir..");


    }
}
