package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;
/*Bir kenar giriniz: 5
0 0 0 0 1
0 0 0 1 0
0 0 1 0 0
0 1 0 0 0
1 0 0 0 0
*/
public class Task07_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kenar giriniz: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {/// satir sayisi icin gerekli

            for (int j = 0; j <n ; j++) {

                if (j == n-i-1) {  ///if (i+j)==(n-1)

                    System.out.print("1 ");

                } else {

                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
