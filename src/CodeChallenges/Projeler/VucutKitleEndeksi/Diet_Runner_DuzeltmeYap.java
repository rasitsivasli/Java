package CodeChallenges.Projeler.VucutKitleEndeksi;

import java.util.ArrayList;
import java.util.Scanner;

public class Diet_Runner_DuzeltmeYap {
    /**** BMI - Vucut Kitle Indeksi ***
     kilo/(boy*boy)  --- boy "metre" cinsinden hesaplamaya dahil edilecek
     =====================================================
     *** Bazal Metabolizma Hizi Hesaplama ***
     Kadin = (10*kilo) + (6.25*boy)-(5*yas)-161
     Erkek = (10*kilo) + (6.25)-(5*yas)+5
     Note : boy "santimetre" cinsinden hesaplamaya dahil edilecek
     ===============================================================================
     *** Hareket / Aktivite seviyeleri ***
     1 - Masa basi is / cak az - Hareketsiz  = 1.2
     2 - Az Aktif / haftada 1-2 egzersiz     = 1.3
     3 - Orta Aktif / haftada 3-5 egzersiz   = 1.55
     4 - Cok aktif / haftada 6-7agir egzersiz= 1.7
     5 - Cok agir egzesiz agir is            = 1.9
     ===============================================================================
     *** Alinmasi gerekli kalori miktari hesaplama ---
     *** Zayif ve normaller icin ***
     1) BMI < 25 ise = Bazal Metabolizma Hizi * Hareket Seviyesi (alması gereken kalori)
     **** Zayiflamak icin **** (hem erkek hem kadın için yap if içinde. cinsiyet değerlendir)
     BMI > 25 ise
     Baba = Bazal Metabolizma Hizi * Hareket Seviyesi - 500
     1-Zayıflamak için kisi günlük olarak "Bazal metabolizma" hizindan dusuk kalori alamaz
     2-Sağlığına kavuşması için alması gereken günlük kalori miktarı Baba
     Kullanıcıdan alınması gerekn bilgiler:
     1-Cinsiyet  2-Yas   3-Boy   4  -kilo    5-Hareket seviyesi*/
    public static void main(String[] args) {

        ArrayList<Diet> kisiler = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Diet kisi = new Diet();
            bilgileriAl(kisi);
            vkiMethodu(kisi);
            bmhMethodu(kisi);
            kaloriMethodu(kisi);
            kisiler.add(kisi);
            System.out.println();
        }

        for (int i = 0; i < kisiler.size(); i++) {
            System.out.println("Kişi " + (i + 1) + " Bilgileri:");
            System.out.println(kisiler.get(i));
            System.out.println();
        }

    }

    private static void kaloriMethodu(Diet kisi) {
        /*1) BMI < 25 ise = Bazal Metabolizma Hizi * Hareket Seviyesi (alması gereken kalori)
     **** Zayiflamak icin **** (hem erkek hem kadın için yap if içinde. cinsiyet değerlendir)
     BMI > 25 ise
     Baba = Bazal Metabolizma Hizi * Hareket Seviyesi - 500
     1-Zayıflamak için kisi günlük olarak "Bazal metabolizma" hizindan dusuk kalori alamaz
     2-Sağlığına kavuşması için alması gereken günlük kalori miktarı Baba*/

        if (kisi.vki<25){
            System.out.println("Sagliklisiniz...");
            kisi.kalori=kisi.BMH* kisi.hareketSeviyesi;
        }else {
            double minKalori = kisi.BMH * kisi.hareketSeviyesi - 500;
            kisi.kalori = Math.max(kisi.BMH, minKalori);// hangisi büyükse onu aliyoruz
        }
        System.out.println("Almaniz gereken gunluk kalori miktari : "+ kisi.kalori);
    }

    public static void bmhMethodu(Diet kisi1) {
        if (kisi1.cinsiyet.equalsIgnoreCase("k")){
            kisi1.boy = (double) kisi1.kilo /100;
            kisi1.BMH = (10 * kisi1.kilo) + (6.25 * kisi1.boy) - (5 * kisi1.yas) - 161;
        }
        else {
            kisi1.BMH = (10 * kisi1.kilo) + (6.25) - (5 * kisi1.yas) + 5;
        }
        System.out.println("kisi1.BMH = " + kisi1.BMH);
    }

    private static void vkiMethodu(Diet kisi1) {
        kisi1.boy = kisi1.boy/100;
        kisi1.vki = (1.0 * kisi1.kilo) / (1.0 * kisi1.boy * kisi1.boy);
        System.out.println("kisi1.vki = " + kisi1.vki);
    }

    public static void bilgileriAl(Diet kisi1) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adinizi giriniz : ");
        kisi1.ad = scanner.next();
        System.out.print("Cinsiyetinizi K veya E olarak giriniz : ");
        kisi1.cinsiyet = scanner.next().substring(0, 1);
        System.out.print("Yas giriniz : ");
        kisi1.yas = scanner.nextInt();
        System.out.print("Boyunuzu giriniz : ");
        kisi1.boy = scanner.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        kisi1.kilo = scanner.nextInt();

        System.out.println("""
                *** Hareket / Aktivite seviyeleri ***
                1 - Masa basi is / cak az - Hareketsiz  = 1.2
                2 - Az Aktif / haftada 1-2 egzersiz     = 1.3
                3 - Orta Aktif / haftada 3-5 egzersiz   = 1.55
                4 - Cok aktif / haftada 6-7agir egzersiz= 1.7
                5 - Cok agir egzesiz agir is            = 1.9""");
        int hareketSecim = scanner.nextInt();
        double hareketSeviyesi = hareketSeviyesi(hareketSecim, kisi1);
        System.out.println("hareketSeviyesi = " + hareketSeviyesi);


    }

    public static double hareketSeviyesi(int hareketSecim, Diet kisi1) {
        switch (hareketSecim) {
            case 1:
                kisi1.BMH = 1.2;
                break;
            case 2:
                kisi1.BMH = 1.3;
                break;
            case 3:
                kisi1.BMH = 1.55;
                break;
            case 4:
                kisi1.BMH = 1.7;
                break;
            case 5:
                kisi1.BMH = 1.9;
                break;
        }
        return kisi1.BMH;


    }
}
