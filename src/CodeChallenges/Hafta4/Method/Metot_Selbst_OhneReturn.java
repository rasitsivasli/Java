package CodeChallenges.Hafta4.Method;

import java.util.Scanner;

public class Metot_Selbst_OhneReturn {
    // Topla adinda bir metot yaziniz
    // Bu metot Scanner class ile iki variable olustursun ve bunlari toplayip ekrana yazsin.

    public static void main(String[] args) {

        topla();

    }

    public static void topla() {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(a+b);
    }
}
