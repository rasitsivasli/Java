package CodeChallenges.Hafta2.selbst;

import java.util.Scanner;

public class soru1 {

    public static void main(String[] args) {

 /*
        Kullanıcıdan girilen harf sayısı bir ise a---aaa
        harf sayısı iki ise ab--- abab
        harf sayısı 3 ve üzeri tek sayısı ise ortadaki harf asa---s
        harf sayısı 3 ve üzeri çift sayı ise ortadaki iki harf masa--as*/


        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int uz = str.length();

        if (uz == 1) {
            System.out.println(str.repeat(3));/// icine kac yazarsak o kadar tekrar yapiyor...
        } else if (uz == 2) {
            System.out.println(str.substring(0, 2) + str.substring(0, 2));

        } else if (uz >= 3 && uz % 2 == 1) {
            System.out.println(str.charAt(uz / 2));

        } else {
            System.out.println(str.substring(uz / 2 - 1, uz / 2 + 1) + "*/");

        }


    }
}
