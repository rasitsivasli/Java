package CodeChallenges.Projeler.VucutKitleEndeksi;

public class Diet {
    /* BMI - Vucut Kitle Indeksi ***
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

    String ad;
    int yas ;
    double boy ;
    int kilo ;
    String cinsiyet;
    double hareketSeviyesi;
    double BMH;
    double vki;
    double kalori;

    public Diet() {
    }

    public Diet(String ad, int yas, int boy, int kilo, String cinsiyet, double hareketSeviyesi) {
        this.ad = ad;
        this.yas = yas;
        this.boy = boy;
        this.kilo = kilo;
        this.cinsiyet = cinsiyet;
        this.hareketSeviyesi = hareketSeviyesi;
    }

    @Override
    public String toString() {
        return "Diet{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", boy=" + boy +
                ", kilo=" + kilo +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", hareketSeviyesi=" + hareketSeviyesi +
                ", BMH=" + BMH +
                ", vki=" + vki +
                ", kalori=" + kalori +
                '}';
    }
}

