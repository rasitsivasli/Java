package _____OSA_____.DE40InterviewQuestions.Day05;

import java.util.Scanner;

public class Q09_TreeShape {
    // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu
    // kullanicidan aliniz..
    // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */
    public static void main(String[] args) {

        System.out.print("Agacin tac uzunlugunu giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int tacUzunlugu = scanner.nextInt();
        for (int i = 1; i <= tacUzunlugu; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('^');
            }
            System.out.println();
        }
            for (int j = 0; j < 5; j++) {
                System.out.println("|||");
            }




    }


}
