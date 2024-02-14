package CodeChallenges.Hafta2.Freitag;

import java.util.Scanner;

public class Iftask5 {

    public static void main(String[] args) {
/*
                For user's age and weight information
        under 18 years of age                        ==>  cannot donate blood.
        over 18 years old and weighs less than 50 kg ==>  cannot donate blood.
        over 18 years old and weighs 50 or more kg   ==>  can donate blood.
        Create code that prints.
         */

        System.out.println("Yasinizi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Kilonuzu giriniz : ");
            int kilo = scanner.nextInt();

            if (kilo >= 50) {
                System.out.println("Kan bagisi yapabilirsiniz...");

            } else System.out.println("Kan bagisi yapamazsiniz...");

        } else System.out.println("Kan bagisi yapamazsiniz...");


    }


}
