package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Beispiel {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        System.out.println("Satir sayisini ");
        int satir = scanner.nextInt();
        System.out.println("Sutun sayisini ");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*  ");

            }
            System.out.println();
        }
    }
}
