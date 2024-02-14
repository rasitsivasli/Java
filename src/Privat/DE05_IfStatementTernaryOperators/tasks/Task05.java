package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int a = scan.nextInt();


        if (a > 99 && a < 1000) {
            System.out.println("a : 3 basamakli");
        } else if (a < 100 && a > 9) {
            System.out.println("a : 3 basamakli");
        } else {
            System.out.println("ikisi de degil");
        }
    }
}
