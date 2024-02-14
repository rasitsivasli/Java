package Privat.DE20_Constructor.selbst;

public class Student {
      /*
Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan bir A_proje class olusturun.
mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
 */

    String ad;
    String soyad;
    int sinif;
    int ortalama;
    int okulNo;
    boolean takdirBelgesi;

    public Student(String ad, String soyad, int sinif, int ortalama, int okulNo, boolean takdirBelgesi) {
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
        this.ortalama = ortalama;
        this.okulNo = okulNo;
        this.takdirBelgesi = takdirBelgesi;
    }
public Student(){

}

    public Student(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }
    public String toString2() {
        return "StudentConstructur{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }

    @Override
    public String toString() {

        return "StudentConstructur{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinif=" + sinif +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdirBelgesi=" + takdirBelgesi +
                '}';
    }
}
