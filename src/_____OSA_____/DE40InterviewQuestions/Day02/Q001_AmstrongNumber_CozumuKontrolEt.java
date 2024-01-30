package _____OSA_____.DE40InterviewQuestions.Day02;

import java.util.Scanner;

public class Q001_AmstrongNumber_CozumuKontrolEt {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
       Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami
        o sayiyi veriyorsa sayi  Armstrong sayidir
           (0, 1, 153, 370, 371, 407)
           153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
           370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

         Soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
         amstrong sayı olup olmadıgını gösteren program yazınız */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = scan.nextInt();

        // 1.cevap
        int sayiBirlerBasamagi = sayi % 10;
        int sayiOnlarBasamagi = (sayi % 100) / 10;
        int sayiYuzlerBasamagi = sayi / 100;

        if (Math.pow(sayiBirlerBasamagi, 3) + Math.pow(sayiOnlarBasamagi, 3) + Math.pow(sayiYuzlerBasamagi, 3) == sayi)
            System.out.println("Sayi Armstrong sayidir");
        else System.out.println("Sayi Armstrong sayi degildir");

        // 2.cevap

        System.out.println("Bir sayi giriniz :");
        int sayi2 = scan.nextInt();

        for (int i = 0; i < sayi2; i++) {
            if (sayi2 > 10) {
                if (sayi2 * sayi2 == sayi2) {
                    System.out.println("Armstrong sayi");
                } else System.out.println("Armstrong sayi degildir");
            }
            if (sayi2 > 100) {
                if (Math.pow(sayiOnlarBasamagi, 2) + Math.pow(sayiBirlerBasamagi, 2) == sayi2) {
                    System.out.println("Armstrong sayi");
                } else System.out.println("Armstrong sayi degildir");
            }
            if (sayi2 > 1000) {
                if (Math.pow(sayiBirlerBasamagi, 3) + Math.pow(sayiOnlarBasamagi, 3) + Math.pow(sayiYuzlerBasamagi, 3) == sayi2) {
                    System.out.println("Sayi Armstrong sayidir");
                } else System.out.println("Armstrong sayi degildir");

            }
        }

    }

}
// 153



