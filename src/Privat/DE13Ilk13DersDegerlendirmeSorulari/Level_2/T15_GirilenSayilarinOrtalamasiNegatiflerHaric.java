package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class T15_GirilenSayilarinOrtalamasiNegatiflerHaric {
    public static void main(String[] args) {
        /* Klavyeden verilen x adet sayının ortalamasını bulan proğram yazınız,
        sayı negatif verilirse ortalamaya katma ve proğramı sonlandır.
        (x sınır değil belirsizlik ifade eder, yani nagatif sayı girilene kadar işleme devam)

         */
        Scanner scanner = new Scanner(System.in);
        int num;
        int toplam = 0;
        int count = 0;
        while (true) {

            System.out.print("Enter number : ");

            num = scanner.nextInt();
            if (num < 0) break;
            count++;
            toplam += num;

        }
        System.out.println((double) toplam / count);
    }
}
