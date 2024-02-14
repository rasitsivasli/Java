package CodeChallenges.Hafta3;

import java.util.Scanner;

public class Test1_EnBuyuk_EnKucukSayi_Tekrar_Coz {
    public static void main(String[] args) {

        //write a code that take  numbers from user at 3 times
        //return maximum number

        //And return minumum number

        Scanner scanner = new Scanner(System.in);
        int enKucuk = Integer.MAX_VALUE;
        int enBuyuk = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {

            int sayi = scanner.nextInt();
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }
        System.out.println("enBuyuk = " + enBuyuk);
        System.out.println("enKucuk = " + enKucuk);
    }
}
