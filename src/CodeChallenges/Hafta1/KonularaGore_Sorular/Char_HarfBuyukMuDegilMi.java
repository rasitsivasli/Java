package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class Char_HarfBuyukMuDegilMi {
    public static void main(String[] args) {
        //Find month name .Input from user an int variable.Check which month and print
        //Example :6 => Haziran
        //Example :25 => invalid

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir karakter girinin : ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("sayi büyük harftir");

        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(Character.toUpperCase(ch));

        } else System.out.println("sayi  harf degildir");


    }
}
