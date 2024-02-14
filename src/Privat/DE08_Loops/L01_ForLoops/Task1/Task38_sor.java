package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task38_sor {
    public static void main(String[] args) {
        /* aşağıdaki şekli oluşturunuz

              *
            * * *
          * * * * *
        * * * * * * *
      * * * * * * * * *
         */
        int n = 5; // Desen boyutu

        for (int i = 1; i <= n; i++) {// satir sayisi
            // Boşlukları yazdır
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // İki boşluk
            }

            // Yıldızları yazdır
            for (int k = 1; k <= 2 * i - 1; k++) {/// her seferinde 2*i -1 adet yildiz koyuyor.
                System.out.print("* ");
            }

            System.out.println(); // Yeni bir satıra geç
        }
        }
    }

