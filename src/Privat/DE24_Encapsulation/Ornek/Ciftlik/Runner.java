package Privat.DE24_Encapsulation.Ornek.Ciftlik;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Ciflik hayvan = new Ciflik();
        System.out.print("Hayvanin ayak sayisini giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int girilenAyakSayisi = scanner.nextInt();

        hayvan.setAyakSayisi(girilenAyakSayisi);
        System.out.println("Girilen ayak sayisi = " + hayvan.getAyakSayisi());

        hayvan = new Ciflik("Erkek",10,5);
        System.out.println("hayvan.getAyakSayisi() = " + hayvan.getAyakSayisi());


    }

}

