package CodeChallenges.Hafta4.Method;

import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("yil giriniz : ");
        int yil = scanner.nextInt();
        System.out.print("Cocugun dogum yilinizi giriniz : ");
        int cocukdYili = scanner.nextInt();

        System.out.print("Annenin dogum yilinizi giriniz : ");
        int annedYili = scanner.nextInt();


        int yaslarFarki = yasHesaplama(yil,cocukdYili,annedYili);
        System.out.println("yaslarToplami = " + yaslarFarki);


    }

    private static int yasHesaplama(int yil, int cocukdYili, int annedYili) {

        int yasAnne= yil-annedYili;
        int yasCocuk= yil-cocukdYili;
        return yasAnne+yasCocuk;
    }
}
