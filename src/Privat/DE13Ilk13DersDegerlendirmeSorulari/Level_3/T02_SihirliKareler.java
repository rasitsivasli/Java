package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T02_SihirliKareler {
    public static void main(String[] args) {
        // Sihirli kareler i çözünüz n= 3, 5, 7, 9 ... olabilir
        // 1 den başlayarak n*n sayı yetleştirlecek, sutun, satır , diyagonel toplamları eşit olacak
        /* MainClass :
         n=5 için
 17 24  1  8 15
 23  5  7 14 16
  4  6 13 20 22
 10 12 19 21  3
 11 18 25  2  9

 n=7 için
 30 39 48  1 10 19 28
 38 47  7  9 18 27 29
 46  6  8 17 26 35 37
  5 14 16 25 34 36 45
 13 15 24 33 42 44  4
 21 23 32 41 43  3 12
 22 31 40 49  2 11 20
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sihirli karenin bir kenarini giriniz : ");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>(n*n);
        for (int i = 1; i <=n*n ; i++) {
            list.add(i);
        }
        System.out.println("list = " + list);
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {

            }
        }
    }
}
