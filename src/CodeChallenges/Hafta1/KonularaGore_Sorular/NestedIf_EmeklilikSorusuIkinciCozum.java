package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class NestedIf_EmeklilikSorusuIkinciCozum {
    public static void main(String[] args) {
        //erkek se 65 yasindan itibaren Kadinsa 60 yasindan itibaren emekli
        //eger eksik yili varsa bunu tamamlamali

        Scanner scan = new Scanner(System.in);
        System.out.print("Cinsiyetinizi Erkek: E veya kadin : K olarak giriniz ");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.print("Yasinizi Giriniz : ");
        int yas = scan.nextInt();

        if (yas < 18 || yas > 80) {
            System.out.println("gecerli bir yas giriniz");
        } else if (yas < 60) {
            if (cinsiyet == 'k') {
                System.out.println(60 - yas + " " + "yil daha calismalisiniz");
            } else if (cinsiyet == 'e') {
                System.out.println(65 - yas + " " + "yil daha calismalisiniz");
            } else {
                System.out.println("cinsiyeti hatali girdiniz");
            }

        } else if (yas < 65) {
            if (cinsiyet == 'k')
                System.out.println("kadin emekli olabilir");
            else if (cinsiyet == 'e') {
                System.out.println(65 - yas + " " + "yil daha calismalisiniz");

            } else {
                System.out.println("cinsiyeti hatali girdiniz");
            }

        } else {
            if (cinsiyet == 'e' || cinsiyet == 'k') {
                System.out.println("herkese emekli olabilir");
            } else System.out.println("hatali giris yaptiniz");

        }
    }
}
