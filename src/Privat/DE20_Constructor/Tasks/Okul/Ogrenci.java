package Privat.DE20_Constructor.Tasks.Okul;

public class Ogrenci {
    String adSoyad;
    String adres;
    int yas;
    int boy;
    Not ogrenciNotu;

    public Ogrenci(String adSoyad, String adres, int yas, int boy, Not ogrenciNotu) {
        this.adSoyad = adSoyad;
        this.adres = adres;
        this.yas = yas;
        this.boy = boy;
        this.ogrenciNotu = ogrenciNotu;
    }

    public Ogrenci() {
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "adSoyad='" + adSoyad + '\'' +
                ", adres='" + adres + '\'' +
                ", yas=" + yas +
                ", boy=" + boy +
                ", ogrenciNotu=" + ogrenciNotu +
                '}';
    }
}
