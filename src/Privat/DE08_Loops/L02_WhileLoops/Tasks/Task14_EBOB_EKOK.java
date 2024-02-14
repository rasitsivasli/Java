package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task14_EBOB_EKOK {

    /*Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
sadece matematikciler çözsün :)
 */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("1.sayiyi giriniz: ");
        int num1 = scanner.nextInt();
        System.out.print("2.sayiyi giriniz: ");
        int num2 = scanner.nextInt();
        int n = 1;
        String ebob = "";//en büyük bölen
        while (n <= num1) {

            if (num1 % n == 0 && num2 % n == 0) {

                ebob = n + "";
            }
            n++;
        }
        int strEBOB= Integer.parseInt(ebob);
        System.out.println("EBOB : " + strEBOB);
        System.out.println("EKOK : " + (num1*num2)/strEBOB);// bir sayinin ebob u ve ekok u carpimi sayilarin carpimidir

    }
}
