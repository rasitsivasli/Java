package Privat.DE08_Loops.L02_WhileLoops.Tasks02;

import java.util.Scanner;

public class Task02_01 {
    public static void main(String[] args) {
        // verilen n sayısından 1 e kadar ekrana yan yana yazdırın,

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Bir sayiyi giriniz: ");
        int n = scanner.nextInt();

        while (n>=1){

            System.out.print(n+" ");

            n--;
        }

    }

}
