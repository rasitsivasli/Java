package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class T14_Ovarloading {
    /* Verilen 2 asyının toplamı bulan metot create ediniz
    paremetler sayılar, return ise toplam,
    ancak, sayılardan herhangi birisi double olabilir, (overloading)

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num = scanner.nextInt();
        System.out.print("Bir sayi daha giriniz : ");
        int num2 = scanner.nextInt();

        System.out.println("sayilarinToplami(num, num2) = " + sayilarinToplami(num, num2));
        System.out.print("Bir double sayi daha giriniz : ");
        double num3 = scanner.nextDouble();
        System.out.println("sayilarinToplami(num, num2) = " + sayilarinToplami(num, num3));

    }

    private static double sayilarinToplami(int a, double b) {
        return a + b;
    }

    private static int sayilarinToplami(int a, int b) {
        return a+ b;
    }
}

