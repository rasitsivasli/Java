package Privat.DE10_MethodCreation.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task24_fibonacci_Arrys_Ile {
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

        int [] fibonacci= new int [n];// 10 elemanli bir dizi olusturduk
        fibonacci [0] = 0;// 0. elemanini basta belirledik
        fibonacci [1] = 1;// 1. elemanini basta belirledik

        for (int i = 2; i <n ; i++) {

            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];// burada her seferinde yeni yerlere elelanlara atadik


        }System.out.print(Arrays.toString(fibonacci));


    }

}
