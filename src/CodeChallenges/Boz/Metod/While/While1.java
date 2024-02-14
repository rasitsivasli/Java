package CodeChallenges.Boz.Metod.While;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {

        // kullanicidan bir sayi ve hesaplamak istedigi üssü isteyin
        // While loop ile üssü hesaplayan method creat ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        System.out.print("Sayinin üssünü giriniz : ");
        int us = scanner.nextInt();

        int sonuc= usHesaplama(sayi, us);
        System.out.println("sonuc = " + sonuc);


    }

    private static int usHesaplama(int sayi, int us) {
        int i = 1;
        int sonuc=1;
        while (i <= us) {
            sonuc*=sayi;

            i++;
        }

        return sonuc;
    }
}
