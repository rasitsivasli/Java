package CodeChallenges.Hafta6_Arrays;

import java.util.Scanner;

public class Soru4_doWhile {
    public static void main(String[] args) {
/*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */


 /*
    Task->
       Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */

        int toplam = 0;
        int count = 0;

        do {
            System.out.print("Sayi giriniz : ");
            Scanner scanner = new Scanner(System.in);
            int sayi = scanner.nextInt();
            toplam += sayi;
            count++;

        } while (toplam <= 100);

        System.out.println(count + " Adet sayi girdiniz");
        System.out.println("Girdiginiz sayilarin toplami 100 ün üzerindedir. Bu kadar yeterli");

    }

}
