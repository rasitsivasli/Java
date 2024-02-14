package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task23_yapildi {
    public static void main(String[] args) {

    /*  Task-> 1 den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı yazınız : ");
        int n = scanner.nextInt();
        long karelerToplami=0;

        for (int i = 1; i <=n ; i++) {
            karelerToplami  += i*i;
        }

        System.out.println("karelerToplami = " + karelerToplami);

    }
}
