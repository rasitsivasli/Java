package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
         /*
        Baba
        Cocuk Cocuk
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..

        */
        Scanner sc = new Scanner(System.in);

        System.out.println("kare için boyut giriniz : ");
        int boyut = sc.nextInt();

        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <= i; j++) {
                ///yukardan gelen i icerdeki Loop da hic degismiyor

                System.out.print((char)(64+i)+" ");/// sayinin ascii degerinden harf yaptik
            }
            System.out.println();


        }
    }
}
