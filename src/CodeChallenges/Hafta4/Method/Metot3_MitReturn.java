package CodeChallenges.Hafta4.Method;

import java.util.Scanner;

public class Metot3_MitReturn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir double sayi giriniz");
        double a = scanner.nextDouble();
        System.out.println("Bir double sayi giriniz");
        double b = scanner.nextDouble();
        double toplam = topla3(a,b);// parametreleri giriyoruz
        System.out.println("toplam = " + toplam);

    }
    private static double topla3(double x, double y) {

        return x+y;// buradaki variable isimleri ayni olmak zorunda daegil
    }

   
}
