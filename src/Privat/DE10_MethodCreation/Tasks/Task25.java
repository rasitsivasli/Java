package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

        //Task-> girilen sayını faktoriyelini print eden METHOD create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyelini almak istediginiz sayiyi giriniz : ");
        int sayi = scanner.nextInt();
        faktoriyel(sayi);

    }

    private static void faktoriyel(int sayi) {
        double faktoriyel=1;

        for (int i = sayi; i >0; i--) {

            faktoriyel*=i;
        }
        System.out.println("faktoriyel = " + faktoriyel);


    }
}
