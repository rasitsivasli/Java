package CodeChallenges.Hafta4.Method;

import java.util.Scanner;

public class MetodOverloading {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz : ");
        int sayi1 = scanner.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        int sayi2 = scanner.nextInt();
        System.out.print("3. sayiyi giriniz : ");
        int sayi3 = scanner.nextInt();
        System.out.print("4. sayiyi giriniz : ");
        int sayi4 = scanner.nextInt();

        System.out.println("carpma(sayi1, sayi2) = " + carpma(sayi1, sayi2));
        System.out.println("carpma2(sayi1, sayi2, sayi3) = " + carpma2(sayi1, sayi2, sayi3));
        System.out.println("carpma3(sayi1, sayi2, sayi3, sayi4) = " + carpma3(sayi1, sayi2, sayi3, sayi4));


    }

    private static int carpma3 (int a, int b, int c, int d) {

        return a*b*c*d;
    }

    private static int carpma(int a, int b) {

        return a * b;
    }

    private static int carpma2(int a, int b, int c) {

        return a * b * c;

    }




}
