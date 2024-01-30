package _____OSA_____.DE40InterviewQuestions.Day04;

import java.util.Scanner;

public class Q10_OddIndexNumber {
    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir metin giriniz :");
        String str = scanner.nextLine();
        String[] strDizi = str.split("");
        StringBuilder yeniStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) yeniStr.append(strDizi[i]);
        }
        System.out.println(yeniStr.toString());

    }

}
