package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class T08_MetindekiBirHarfinIndexleriniBulma {
    // Klavyeden grilen bir stringin içerisinde "a" herfleri geçmektedir, bu a harflerinin bulunduğu
    // indexleri yazdırın
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz ");
        String str = scanner.nextLine();

        System.out.print("a harflerinin  bulundugu indexler : ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                int index = i;
                System.out.print(index + ",");
            }

        }


    }
}
