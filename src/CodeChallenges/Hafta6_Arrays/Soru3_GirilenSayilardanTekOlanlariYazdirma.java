package CodeChallenges.Hafta6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru3_GirilenSayilardanTekOlanlariYazdirma {
    public static void main(String[] args) {
/*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */

        Scanner scanner = new Scanner(System.in);

        int count = 0;

        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Sayi giriniz : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("array = " + Arrays.toString(array));
        System.out.print("Tek sayilar : ");
        for (int i = 0; i < 5; i++) {

            if (array[i] % 2 == 1) {
                System.out.print(array[i] + ",");
                count++;
            }

        }
        System.out.println("\ncount = " + count);
    }

}
