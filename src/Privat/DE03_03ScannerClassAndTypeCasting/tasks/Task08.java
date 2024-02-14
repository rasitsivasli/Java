package Privat.DE03_03ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        System.out.print("1. Vize notunuzu giriniz : ");
        Scanner scan = new Scanner(System.in);
        int vize1 = scan.nextInt();

        System.out.print("2. Vize notunuzu giriniz : ");
        int vize2 = scan.nextInt();
        System.out.print("Final notunuzu giriniz : ");
        int fnl = scan.nextInt();

        double gecmeN = ((vize1+vize2)/2)*0.3+fnl*0.7 ;
        System.out.println("Gecme notunuz : "+ gecmeN );



    }
}
