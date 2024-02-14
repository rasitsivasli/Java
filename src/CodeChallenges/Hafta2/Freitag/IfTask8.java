package CodeChallenges.Hafta2.Freitag;

import java.util.Scanner;

public class IfTask8 {
    public static void main(String[] args) {
/*Kullanıcıdan ayrı ayrı alınan isim ve soy isim bilgilerini tek bir satırda çıktısını alın.
 İlk harfler büyük olmalı.Soy ismin tamamı büyük
 Kullanıcının birden fazla ismi olabilir
 Ör:
 isim : asya zeynep
 soyisim: coOl
 Çıktı: Asya Zeynep COOL

 Ör:
 isim asya
 soyisim: coll
 Çıktı: Asya COLL
 */

        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz : ");
        String ad= scan.nextLine();
        System.out.print("Lütfen soyisminizi giriniz : ");
        String soyAd= scan.nextLine();
        ad = ad.toUpperCase().charAt(0)+ad.substring(1);
        soyAd = soyAd.toUpperCase();

        if (ad.contains(" ")){
            System.out.print(ad.toUpperCase().charAt(0)+ad.substring(1,ad.indexOf(" "))+" ");
            System.out.println(ad.toUpperCase().charAt(ad.indexOf(" ")+1)+ad.substring(ad.indexOf(" ")+2));
            System.out.println(soyAd.toUpperCase());
        }
        else System.out.println(ad+" "+soyAd);





    }
}
