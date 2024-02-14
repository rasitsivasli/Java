package Privat.DE07zIlk7dersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // Klavyeden isim ve soyisim tek variable okunuyor giriliyor
        // isim ve soy ismi alt alta yazdırınız
        // ( isim 2 adet olabilir, bu durumda isimler 1. satıra, soy isim ise 2.satıra gelmelidir.)


        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String ad = str.substring(0,str.indexOf(" "));
        System.out.println(ad);

        String soyAd = str.substring(str.indexOf(" ")+1);
        System.out.println(soyAd);

    }
}
