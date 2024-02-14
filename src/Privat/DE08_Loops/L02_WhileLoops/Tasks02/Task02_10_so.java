package Privat.DE08_Loops.L02_WhileLoops.Tasks02;

import java.util.Scanner;

public class Task02_10_so {
    public static void main(String[] args) {
        /*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        şekli while ile (nxn olacak şekilde ) tek while kullanarak yazdırın
        * sadece 1 adet System.out.print("* "); kullanılabilir
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Bir kenar sayisi giriniz: ");
        int n = scanner.nextInt();
        int i = 1;

        while (i <= n * n) {
            System.out.print("* ");

            if (i % n == 0) {
                System.out.println(); // Satır sonuna geldiğinde bir alt satıra geç
            }

            i++;
        }


    }
}
