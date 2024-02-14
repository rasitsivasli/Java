package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T03 {
    /* n sayısına göre aşağıdaki şekli yazdırıan bir code yazınız
    örnek n= 5 olsun
    * * * * *
     * * * *
      * * *
       * *
        *
     */
    public static void main(String[] args) {

        System.out.print("n sayısını giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Yıldızları yazdırma
        for (int i = n; i >= 1; i--) {
            // Boşlukları yazdırma
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Yıldızları yazdırma
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Bir sonraki satıra geçme
            System.out.println();
        }



    }
}
