package CodeChallenges.Hafta4.ForWhileOrnek;

import java.util.Scanner;

public class AsyaHanim1_SayininRakamlariToplami {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
        //1453 ---1+4+5+3= 13


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz ");
        int sayi = scanner.nextInt();
        int rakam ;
        int toplam = 0;

        for (int i = 1; i <=sayi; i++) {
            rakam= sayi%10;
            sayi=sayi/10;
            toplam+=rakam;
            if (sayi==0){
                break;
            }

        } System.out.println("toplam = " + toplam);

    }
}
