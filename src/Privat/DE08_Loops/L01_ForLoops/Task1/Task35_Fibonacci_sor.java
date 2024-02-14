package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task35_Fibonacci_sor {
    public static void main(String[] args) {

        // verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........
        // serinin ilk elemanı 0, sonraki, 1, daha sonrakiler ise kendinden önce gelen 2 elemanın toplamıdır

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaca kadar bir Fibonacci dizisi istiyorsunuz : ");
        int n = scanner.nextInt();
        int onceki = 0, sonraki = 1; //// ilk iki sayiyi yazdik önce
        System.out.print(onceki+" "+sonraki+" ");

        /// verilen sayi n is , yani n adet yazmak icin
        for (int i = 2; i < n; i++) {

            int ucuncuSayi = onceki + sonraki;
            System.out.print(ucuncuSayi + " ");

            // bir sonraki elemani bulmak icin alt 2 satira hazurlik yapiyoruz
            onceki=sonraki;
            sonraki=ucuncuSayi;

        }


    }
}
