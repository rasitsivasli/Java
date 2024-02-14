package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class T09_MetindekiBelirliBirHarfSayisiniBulma {
    public static void main(String[] args) {
        // Klavyeden grilen bir stringin içerisinde kaç adet "a" herfi geçmektedir, yazdırınız
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String str = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a') count++;
        }
        System.out.print("Metinde " + count + " adet a harfi vardir");
    }
}
