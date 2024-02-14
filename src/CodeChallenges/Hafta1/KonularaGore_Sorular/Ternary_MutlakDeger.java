package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class Ternary_MutlakDeger {
    public static void main(String[] args) {
        // Kulanicidan alinan degerin mutlak degeri
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        double sayi = scanner.nextDouble();

        System.out.println(sayi<0? sayi*-1: sayi );
    }
}
