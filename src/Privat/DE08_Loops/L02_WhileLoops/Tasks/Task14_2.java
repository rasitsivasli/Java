package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task14_2 {

    /*Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
sadece matematikciler çözsün :)
 */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int num2 = scanner.nextInt();

        int originalNum1 = num1;
        int originalNum2 = num2;

        // EBOB hesaplama
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        int ebob = num1;

        // EKOK hesaplama
        int ekok = (originalNum1 * originalNum2) / ebob;

        System.out.println("EBOB (" + originalNum1 + ", " + originalNum2 + ") = " + ebob);
        System.out.println("EKOK (" + originalNum1 + ", " + originalNum2 + ") = " + ekok);

        scanner.close();

    }
}
