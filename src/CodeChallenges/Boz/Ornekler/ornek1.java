package CodeChallenges.Boz.Ornekler;

import java.util.Scanner;

public class ornek1 {
    public static void main(String[] args) {

        // multi branch if statement check more than two conditions
        /*
         *4 tane  String veri tipi tanımlayınız :Tomato, potatoes,pepper, onion
         * 4 adet double price : 15.45, 16.50, 35.7, 11.25
         * Kullanıcıdan adet girişi alınız.Toplam fiyat 100 Tl'den fazla olur ise
         *  "bakiyeniz yetersiz" çıktısı alın */

        Scanner scan = new Scanner(System.in);


        System.out.print("Ne satin almak istiyorsunuz? (Tomato, potatoes,pepper, onion) :  ");
        String urun = scan.next();
        String str1 = "Tomato";
        String str2 = "potato";
        String str3 = "pepper";
        String str4 = "onion";

        double tomatoUc = 15.45;
        double potatoUc = 16.50;
        double pepperUc = 35.7;
        double onionUc = 11.25;
        double toplamTutar = 0;

        System.out.print("Kac kilo satin almak istiyor sunuz : ");
        int kilo = scan.nextInt();

        if (urun.equalsIgnoreCase("Tomato")) {
            toplamTutar = kilo * tomatoUc;
            System.out.println("Fiyat : " + toplamTutar);

        } else if (urun.equalsIgnoreCase("potato")) {
            toplamTutar = kilo * potatoUc;
            System.out.println(toplamTutar);
        } else if (urun.equalsIgnoreCase("pepper")) {
            toplamTutar = kilo * pepperUc;
            System.out.println(toplamTutar);
        } else if (urun.equalsIgnoreCase("onion")) {
            toplamTutar = kilo * onionUc;
            System.out.println(toplamTutar);
        } else {
            System.out.println("yanlis veri girdiniz");
        }
        if (toplamTutar>100){
            System.out.println("tutari astiniz");
        }
        else {
            System.out.println("Kalan Bakiyeniz : "+(100-toplamTutar));
        }
    }
}
