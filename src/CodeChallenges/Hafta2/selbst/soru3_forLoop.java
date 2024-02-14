package CodeChallenges.Hafta2.selbst;

import java.util.Scanner;

public class soru3_forLoop {


    public static void main(String[] args) {
/* Kullanıcıdan içinde boşluk içermeyen bir password girmesini isteyin.
   Girilen passwordu **** şeklinde çıktı alın.
   Ardından tekrar passwordu doğrulamasını isteyin
   Eğer girilen şifreler aynı ise "Pass"
   Değilise "Try Again" yazdırın*/

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Bosluksuz bir password giriniz : ");


        String str = scanner.nextLine();

//        System.out.println(str.replaceAll("[^\\s]", "*"));
//        System.out.print(" Bosluksuz bir password giriniz : ");
//
//        String strDogrulama = scanner.nextLine();
//        if (Objects.equals(strDogrulama, str)) {
//
//            System.out.println("dogru girdiniz");
//        } else
//            System.out.println("yanlis girdiniz");
//
        int sonDeger = str.length();
        String yeni = "";

        if (str.length() == str.replaceAll(" ", "").length()) {

            for (int i = 1; i <= sonDeger; i++) {
                System.out.print("*");
            }
            System.out.println(yeni);

            System.out.println("Password u tekrar giriniz");
            String strGiris2 = scanner.nextLine();
            if (str.equals(strGiris2)) {
                System.out.println("dogru giris yaptiniz");
            } else
                System.out.println("tekrar deneyiniz");

        } else System.out.println("Password da bosluk vardir, tekrar giriniz");
    }
}

