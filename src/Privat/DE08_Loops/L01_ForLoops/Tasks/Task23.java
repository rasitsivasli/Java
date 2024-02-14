package Privat.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  Task-> 1 den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        System.out.print("bir tamsayi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i<=sayi; i++) {

            toplam +=i*i;

        }
        System.out.println("toplam = " + toplam);
    }
}
