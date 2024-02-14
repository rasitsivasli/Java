package Privat.DE10_MethodCreation.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task24_Arrys {
    public static void main(String[] args) {
/*
       Task->

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
                                                       // i=2 iken i-1=1 ve i-2=0 .. 2. terim fibonacci[2]=1

        }System.out.print(Arrays.toString(fibonacci));


    }

}
