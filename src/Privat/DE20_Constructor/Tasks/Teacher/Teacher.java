package Privat.DE20_Constructor.Tasks.Teacher;

public class Teacher {
    /*field ları  id,ad,name,brans, tecrube, maas, emekli
     olan bir Teacher class ı oluşturun
    Constructor ve toString metotları oluşturun
    10 adet ogretmen  verisi oluşturup bunları bir array liste atın
   daha sonra, ekli olmayanları, ad soyad ve maaşlarını liste şeklinde yazdırın
     */
    int idNo;
    String ad;
    String soyAd;
    String brans;
    int tecrube;
    int maas;
    boolean emekliMi;

    public Teacher() {
    }

    public Teacher(int idNo, String ad, String soyAd, String brans, int tecrube, int maas, boolean emekliMi) {
        this.idNo = idNo;
        this.ad = ad;
        this.soyAd = soyAd;
        this.brans = brans;
        this.tecrube = tecrube;
        this.maas = maas;
        this.emekliMi = emekliMi;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "idNo=" + idNo +
                ", ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", brans='" + brans + '\'' +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                ", emekliMi=" + emekliMi +
                '}' + "\n";
    }
}
