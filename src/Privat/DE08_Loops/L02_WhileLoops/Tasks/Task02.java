package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while loop
         */


        Scanner scanner = new Scanner(System.in);
        System.out.print("1.sayiyi giriniz : ");
        int num1 = scanner.nextInt();
        System.out.print("2.sayiyi giriniz : ");
        int num2 = scanner.nextInt();

        while (num1 < num2) {

            System.out.print(num1 + ",");
            num1++;
        }
        while (num2 < num1) {

            System.out.print(num2 + ",");
            num2++;
        }

    }
}
