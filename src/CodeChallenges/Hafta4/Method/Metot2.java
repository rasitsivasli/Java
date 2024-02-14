package CodeChallenges.Hafta4.Method;

import java.util.Scanner;

public class Metot2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        topla2(a,b); //buradaki a ve b verileri asagiya göndermek icin kullaniyoruz...

    }

    private static void topla2(double a, double b) {// eger return la geriye veri göndermeyeceksek yani sadece islem ve
                                                    //  cikti alacaksak void kullanilmali..
        System.out.println(a+b);

    }
}
