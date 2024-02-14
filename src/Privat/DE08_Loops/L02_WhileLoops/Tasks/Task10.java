package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // Task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfenin hangi sayiya kadar tek sayilarin toplamlarini görmek istiyorsaniz bu sayiyi giriniz: ");
        int num = scanner.nextInt();


        int n = 1;

        while (n <= num) {

            if (n % 2 == 1) {

                System.out.print(n + ",");
            }
            n++;
        }

    }
}
