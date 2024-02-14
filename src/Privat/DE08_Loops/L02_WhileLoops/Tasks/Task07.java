package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 5 sayının en buyugunu print eden code create ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("5 adet sayi giriniz: ");


        int n = 1;
        int enBuyuk = Integer.MIN_VALUE;

        while (n <= 5) {
            int num = scanner.nextInt();
            if (num > enBuyuk) {
                enBuyuk = num;

            }
            n++;
        }
        System.out.print("En büyük sayi: " + enBuyuk);
    }
}
