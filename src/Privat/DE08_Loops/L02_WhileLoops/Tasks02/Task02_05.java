package Privat.DE08_Loops.L02_WhileLoops.Tasks02;

import java.util.Scanner;

public class Task02_05 {
    public static void main(String[] args) {
        // ekrandan 10 adet sayı giriniz ve bunların toplamını bulunuz

        Scanner scanner = new Scanner(System.in);
        int n=1;
        int total=0;

        while (n<=10){

            System.out.print(n+". sayiyi giriniz: ");
            int num = scanner.nextInt();
            total+=num;
            n++;
        }
        System.out.println("total = " + total);


    }
}
