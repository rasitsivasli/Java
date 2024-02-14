package CodeChallenges.Hafta6_Arrays;

import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {

        /* Task ->
   Girilen iki integer sayının eşitliğini kontrol eden java methodunu yazınız.
    num1 = num2 => true
    */

        System.out.println("Iki adet sayi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        System.out.println("sayilarEsitMi(sayi1,sayi2) = " + sayilarEsitMi(sayi1, sayi2));

    }

    private static boolean sayilarEsitMi(int sayi1, int sayi2) {
        return sayi1 == sayi2;
    }


}