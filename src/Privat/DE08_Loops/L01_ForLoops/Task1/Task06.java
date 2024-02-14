package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.
//
//        System.out.print("kac satir yazdirmak istiyorsunuz ? ");
//        Scanner scanner = new Scanner(System.in);
//        int satirSayisi=scanner.nextInt();
//        System.out.print("kac kare yanyana yazdirmak istiyorsunuz ? ");
        int carpim;


        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                carpim = i * j;
                System.out.println(i+"*"+j+"="+carpim);
            }
            System.out.println();// bir satir bittiginde alt satira gecmek icik
        }
    }
}
