package CodeChallenges.Boz.Ornekler;

import java.util.Scanner;

public class Ornek2_2 {
    public static void main(String[] args) {
        //Ayın adını bulun. Kullanıcıdan bir int değişkeni girin. Hangi ayı kontrol edin ve yazdırın
        //Örnek :6 => Haziran
        //Örnek :25 => geçersiz

        System.out.println("Kacinci ay oldugunu giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int ay = scanner.nextInt();

        boolean sayi = ay >= 1 && ay <= 12;

        if (sayi) {
            if (ay == 1) {
                System.out.println("ocak");
            } else if (ay == 2) {
                System.out.println("subat");
            } else if (ay == 3) {
                System.out.println("mart");
            } else if (ay == 4) {
                System.out.println("nisan");
            } else if (ay == 5) {
                System.out.println("mayis");
            } else if (ay == 6) {
                System.out.println("haziran");
            } else if (ay == 7) {
                System.out.println("temmuz");
            } else if (ay == 8) {
                System.out.println("agustos");
            } else if (ay == 9) {
                System.out.println("eylül");
            } else if (ay == 10) {
                System.out.println("ekim");
            } else if (ay == 11) {
                System.out.println("kasim");
            } else {
                System.out.println("aralik");
            }
        } else {
            System.out.println("gecersiz sayi girdiniz");
        }
    }
}