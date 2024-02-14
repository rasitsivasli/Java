package Privat.DE08_Loops.L02_WhileLoops.Tasks02;

import java.util.Scanner;

public class Task02_06 {
    public static void main(String[] args) {
        // ekrandan 10 adet sayı giriniz ve bunların tek sayı olanların toplamını bulunuz


        Scanner scanner = new Scanner(System.in);
        int n=1;
        String tek="";


        while (n<=10){
            System.out.print(n+". sayiyi giriniz: ");
            int num = scanner.nextInt();
            if (num%2==1){
                tek+=num+",";

            }
            n++;
        } System.out.print("Tek sayilar = " + tek);

    }
}
