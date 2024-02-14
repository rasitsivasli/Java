package CodeChallenges.Hafta2.Freitag;

import java.util.Scanner;

public class ifTask9 {
    public static void main(String[] args) {

 /* Barkod oluşturma:
        Kullanıcıdan alınan ürün isim ve markasını girip iki
        basmaklı rondom bir sayı ile birleştirerek barkod numarası oluşturun
        Örn:
            ürünadı=makarna
            markası=poli
            random =23
            çıktı barkod : mapo23
            */
        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen ürün adini giriniz : ");
        String urunAdi= scan.nextLine();
        System.out.print("Lütfen ürün markasini giriniz : ");
        String urunMarkasi= scan.nextLine();
        int random = (int) (Math.random()*90+10);/// iki basamakli

        System.out.println("Barkod : "+urunAdi.substring(0,2)+urunMarkasi.substring(0,2)+random);

    }
}

