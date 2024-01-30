package _____OSA_____.DE40InterviewQuestions.Day04;

import java.util.Scanner;

public class Q03_CountFactors {
    /*
      Type java code by using while loop,
     Write a program to count the factors of an integer which is entered by user.
     Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
     Factors of 8  = 1, 2, 4, 8 ==> 4
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("carpanlarini bulmak istediginiz sayiyi giriniz :");
        int num = scan.nextInt();
        System.out.print(num + " sayisinin carpanlari : ");
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(num + " sayisinin toplam " + count + " adet carpani vardir");
    }

}
