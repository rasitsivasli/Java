package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class Nested_If_Emeklilik {
    public static void main(String[] args) {
        //erkek se 65 yasindan itibaren Kadinsa 60 yasindan itibaren emekli
        //eger eksik yili varsa bunu tamamlamali

        Scanner scan = new Scanner(System.in);
        System.out.print("Cinsiyetinizi Erkek: E veya kadin : K olarak giriniz ");
        char cinsiyet = scan.next().toUpperCase().charAt(0);


        if (cinsiyet == 'E') {
            System.out.print("Lütfen yasinizi giriniz: ");
            int yas = scan.nextInt();
            if (yas < 0 || yas > 100) {
                System.out.println("gecersiz yas");
            } else if (yas >= 65) {
                System.out.println("Erkek ve emekli olabilir");

            } else {
                System.out.println(65 - yas + " " + "daha calismaniz gerekmektedir.");
            }
        } else if (cinsiyet == 'K') {
            System.out.print("Lütfen yasinizi giriniz: ");
            int yas = scan.nextInt();
            if (yas < 0 || yas > 100) {
                System.out.println("gecersiz yas");
            } else if (yas >= 60) {
                System.out.println("Kadin ve emekli olabilir");

            } else {
                System.out.println(60 - yas + " " + "daha calismaniz gerekmektedir.");
            }

        } else System.out.println("Cinsiyeti yanlis girdiniz..");


    }
}
