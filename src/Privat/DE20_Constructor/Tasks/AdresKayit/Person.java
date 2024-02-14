package Privat.DE20_Constructor.Tasks.AdresKayit;

public class Person {
    // Ayrıca bir personel clası olusturun , bu class adSoyad,dogumYılı ve adres
    String adSoyad;
    int dYili;
    Adres adres;

    public Person(String adSoyad, int dYili, Adres adres) {
        this.adSoyad = adSoyad;
        this.dYili = dYili;
        this.adres = adres;
    }



    @Override
    public String toString() {
        return "Ogretmen{" +
                "adSoyad='" + adSoyad + '\'' +
                ", dYili=" + dYili +
                ", adres=" + adres +
                '}';
    }
}
