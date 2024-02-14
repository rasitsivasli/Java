package Privat.DE03_03ScannerClassAndTypeCasting.Sorular;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        System.out.print("Isim giriniz : ");
        String isim = veri.nextLine();

        System.out.print("Soyisim giriniz : ");
        String soyI = veri.nextLine();

        System.out.print("Yasinizi giriniz : ");
        int yas = veri.nextInt();

        veri.nextLine();

        System.out.print("Bildiginiz dilleri giriniz : ");
        String diller = veri.nextLine();



        System.out.println(isim+" "+ soyI + " " + " " + yas + " " +diller);

    }
}

