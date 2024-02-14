package CodeChallenges.Hafta4.Method;

import CodeChallenges.Boz.Metod.Task2_intMethod;

public class Method {
    public static void main(String[] args) {
        System.out.println("Method create ediniz");
        toplam(25,50);
        System.out.println(Task2_intMethod.adSoyad("rasit", "sivasli"));

    }

    public static void toplam(int x, int y ) {
        int n1;
        int n2;
        int toplam = x + y;
        System.out.println(toplam);
    }
}
