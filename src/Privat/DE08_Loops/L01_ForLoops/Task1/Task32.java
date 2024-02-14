package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        /*

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        şeklipriint eden code create ediniz
        n=4 , n değişebilir
         */

        // ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz


        Scanner scanner = new Scanner(System.in);

        System.out.println("kare için boyut giriniz : ");
        int n = scanner.nextInt();
        String yildiz = "";

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=i; j++) {// burada  satir yaziliyor

                System.out.print("* ");
            }
            System.out.println();// bosluk icin

        }
        for (int i =1; i <n ; i++) {

            for (int j = 1 ; j <=(n-i); j++) {// burada  satir yaziliyor// n-i yaparak yildiz sayisini azaltiyorum

                System.out.print("* ");

            }
            System.out.println();// bosluk icin

        }
        System.out.println("----------------");
//        2.yol benim cözüm

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=i; j++) {// burada  satir yaziliyor

                System.out.print("* ");
            }
            System.out.println();// bosluk icin

        }
        for (int i =1; i <n ; i++) {

            for (int j = n-i ; j >0; j--) {// burada  satir yaziliyor// n-i yaparak yildiz sayisini azaltiyorum

                System.out.print("* ");

            }
            System.out.println();// bosluk icin

        }


    }
}
