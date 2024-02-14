package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task20_tekrarBakabilirsin {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.

        Scanner sc = new Scanner(System.in);

        System.out.println("kare için boyut giriniz : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sayi = i;

            for (int j = 1; j <= i; j++) {

                System.out.print(sayi + " ");
                sayi += (n - j);

            }
            System.out.println();//bir alt satira yazmak icin
        }


    }
}
