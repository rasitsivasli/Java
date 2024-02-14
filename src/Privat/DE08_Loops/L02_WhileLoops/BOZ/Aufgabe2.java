package Privat.DE08_Loops.L02_WhileLoops.BOZ;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {

        // 1 den 100 e kadar olan sayilarin toplami mit While

        int toplam = 0;
        girilenOnSayininToplami(toplam);


    }

    private static void girilenOnSayininToplami(int topla) {

        int sayac = 0;
        while (true) {
            System.out.print("Sayi giriniz : ");
            Scanner scanner = new Scanner(System.in);
            int sayi = scanner.nextInt();
            topla += sayi;
            sayac++;

            if (topla > 500) {
                System.out.println("toplam 500 ü gecti yeter...");
                break;
            }
            if (sayac > 10) {
                System.out.println("10 dan fayla sayi giremezsin yeter...Islem bitti");
                break;
            }

        }
        System.out.println("Sayilarin toplami : " + topla);
        System.out.println("sayac = " + sayac);

    }
}
