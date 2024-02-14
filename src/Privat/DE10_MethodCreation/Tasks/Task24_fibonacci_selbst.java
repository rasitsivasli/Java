package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task24_fibonacci_selbst {
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
        int birinciTerim = 0;
        int ikinciTerim = 1;
        System.out.print("0 1 ");
        for (int i = 2; i <n ; i++) {

            int ucuncuTerim = birinciTerim+ikinciTerim;
            System.out.print(ucuncuTerim+" ");

            birinciTerim=ikinciTerim;
            ikinciTerim=ucuncuTerim;
        }


    }

}
