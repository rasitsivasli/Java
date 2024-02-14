package Privat.DE10_MethodCreation.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task24_Arrysörnek {
    public static void main(String[] args) {
/*
       Task-> 1 den baslayan bir öncekinin 2 fazlasi olan bir dizi olusturun

*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizide kac adet sayi görmek istiyorsunuz : ");
        int n = scanner.nextInt();
        fibDizisi(n);

    }

    private static void fibDizisi(int n) {

        int [] fib= new int [n];// 10 elemanli bir dizi olusturduk
        fib [0] = 1;// 0. elemanini basta belirledik

        for (int i = 1; i <n ; i++) {

            fib[i]=fib[i-1]+2;// burada her seferinde yeni yerlere elelanlara atadik

        }System.out.print(Arrays.toString(fib));


    }

}
