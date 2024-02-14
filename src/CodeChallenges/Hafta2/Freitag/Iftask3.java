package CodeChallenges.Hafta2.Freitag;

import java.util.Scanner;

public class Iftask3 {

    public static void main(String[] args) {

/* Task->
             For the entered age data
             age <= 18      ==> not eligible to vote
             age >= 70      ==> can vote three times
             70 > age >= 50 ==> can vote twice
             50 > age >= 18 ==> can vote once,
             Create the code that prints...
         */

        System.out.println("Yasinizi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("not eligible to vote");

        } else {
            if (age >= 70) {
                System.out.println("can vote three times");
            } else if (age >= 50) {
                System.out.println("can vote twice");
            } else  {
                System.out.println("can vote once");
            }

        }
    }
}
