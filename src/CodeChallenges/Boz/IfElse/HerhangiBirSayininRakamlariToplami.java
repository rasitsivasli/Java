package CodeChallenges.Boz.IfElse;

import java.util.Scanner;

public class HerhangiBirSayininRakamlariToplami {
    public static void main(String[] args) {


// Kullanici alinan sayinin rakamlari toplamini bulun..
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bir sayi giriniz : ");
//        String strSayi = scanner.next();
//
//        // 1.yol
//
//        int sum = 0;
//        for (int i = 0; i < strSayi.length(); i++) {
//
//            sum += Integer.parseInt(strSayi.substring(i, i + 1));
//
//        }
//        System.out.println(sum);


        //2. yol
        System.out.println("*********");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();

        int basamakSayisi = sayi+"".length();
        int birlerBasamagi=0;
        int sum = 0;

        for (int i = 0; i < basamakSayisi; i++) {

            birlerBasamagi=sayi%10;
            sayi=sayi/10;
            sum+=birlerBasamagi;
        }
        System.out.println(sum);

    }
}
