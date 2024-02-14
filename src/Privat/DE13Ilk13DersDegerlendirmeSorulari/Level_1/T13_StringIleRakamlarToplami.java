package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class T13_StringIleRakamlarToplami {
    public static void main(String[] args) {
        /* Klavyeden 3 basamaklı nir sayı string olarak veriliyor, rakamları toplamını bulunuz
        input  : "341"
        output : 8

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num = scanner.nextInt();
        rakamlarToplamiIkinciYol(num);
    }

    private static void rakamlarToplamiIkinciYol(int num) {
        String str = "" + num;
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            toplam += Integer.parseInt("" + str.charAt(i));

        }
        System.out.println(toplam);
    }
}

