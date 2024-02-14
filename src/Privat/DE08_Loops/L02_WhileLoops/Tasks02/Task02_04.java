package Privat.DE08_Loops.L02_WhileLoops.Tasks02;

import java.util.Scanner;

public class Task02_04 {
    public static void main(String[] args) {
        // n1 den n2 kadar, tek ve çift sayıların toplamını bulan program yazınız


        Scanner scanner = new Scanner(System.in);
        System.out.print(" Birinci sayiyi giriniz: ");
        int n1 = scanner.nextInt();
        System.out.print(" Ikinci sayiyi giriniz: ");
        int n2 = scanner.nextInt();

        while (n1<=n2){

            if (n1%2==0){
                System.out.print(n1+",");
            }
            n1++;
        }


    }
}