package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task08_PRINTF {
    public static void main(String[] args) {
/*
        Task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */
        Scanner input=new Scanner(System.in);
        System.out.print("bizim gızzz birinç sayı gir bakennn : ");
        int n=input.nextInt();
        int carpim =1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                carpim=i*j;// i=1 icin  i*j=1,i*2,i*3.....

                System.out.printf("%3d",carpim);/// printf ile yaptik
            }
            System.out.println();

        }




    }
}
