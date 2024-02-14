package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class T07_BasHarfiBuyukYazma {
    public static void main(String[] args) {
        // Isim ve soy isimi klavyeden okutun
        //ve baş harflerini buyuk yapıp yazdırın
        // input : "hacı hasan"
        // output : "Hacı Hasan"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = scanner.next().toLowerCase();
        System.out.print("Enter surname : ");
        String surName = scanner.next().toLowerCase();
        System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1) + " " +
                surName.substring(0, 1).toUpperCase() + surName.substring(1));
    }
}
