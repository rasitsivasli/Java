package CodeChallenges.Boz.Ornekler;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {

        //Find month name .Input from user an int variable.Check which month and print
        //Example :6 => Haziran
        //Example :25 => invalid
        Scanner scanner = new Scanner(System.in);
        int months = scanner.nextInt();
        boolean isMonths = months >= 1 && months <= 12;

        if (isMonths) {
            System.out.println("valid");
            if (months == 1) {
                System.out.println("Ocak");
            } else if (months == 2) {
                System.out.println("subat");
            } else if (months == 3) {
                System.out.println("mart");
            } else if (months == 4) {
                System.out.println("nisan");
            } else if (months == 5) {
                System.out.println("mayis");
            } else if (months == 6) {
                System.out.println("haziran");
            } else if (months == 7) {
                System.out.println("temmuz");
            } else if (months == 8) {
                System.out.println("agustos");
            } else if (months == 9) {
                System.out.println("eylül");
            } else if (months == 10) {
                System.out.println("ekim");
            } else if (months == 11) {
                System.out.println("kasim");
            } else System.out.println("aralik");
        }

    else

    {
        System.out.println("invalid");
    }


}}

