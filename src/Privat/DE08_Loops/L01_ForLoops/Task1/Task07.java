package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kenar giriniz: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {/// satir sayisi icin gerekli

            for (int j = 0; j < n; j++) {

                if (i == j) {

                    System.out.print("1 ");

                } else {

                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}




