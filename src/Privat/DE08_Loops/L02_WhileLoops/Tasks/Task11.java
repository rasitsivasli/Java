package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    Task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;

        while (true) {
            System.out.print("Lütfenin bir sayi giriniz: ");
            int n = scanner.nextInt();

            if (n == 0) {
                System.out.println("0 girdiniz..");
                break;
            }
            total += n;
            count++;

        }
        System.out.println("total = " + total);
        System.out.println("count = " + count);

    }
}
