package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task24_fibonacci {
    public static void main(String[] args) {
/*
       Task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :0, 1, 1, 2, 3, 5, 8, 13, 21, 34

*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci dizisinde kac adet sayi görmek istiyorsunuz : ");
        int n = scanner.nextInt();
        fibonacciDizisi(n);

    }

    private static void fibonacciDizisi(int n) {

        System.out.print("0 1 ");
        int onceki=0, sonraki=1;
        for (int i = 2; i < n; i++) {

            int ucuncuSayi = onceki + sonraki;
            System.out.print(ucuncuSayi + " ");

            // bir sonraki elemani bulmak icin alt 2 satira hazirlik yapiyoruz
            onceki=sonraki;
            sonraki=ucuncuSayi;
        }

    }

}
