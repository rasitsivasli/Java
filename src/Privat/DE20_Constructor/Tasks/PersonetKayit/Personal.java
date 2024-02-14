package Privat.DE20_Constructor.Tasks.PersonetKayit;

public class Personal {
    // bir B_Musteriler clası oluşturun, cadde,postaKodu,şehir,kapıNo alanları olsun
    // Ayrıca bir personel clası olusturun , bu class adSoyad,dogumYılı ve adres alanlarından oluşsun
    // AnaClass da constractor yardımı , PersonelClass tan oluş bir ArrayListe veriler atın

    String adSoyad="rasit";
    int dogumYili;
    String adres;
    String milliyet= "tc";

    public Personal() {
    }

    public Personal(String adSoyad, int dogumYili, Adres adres) {
        this.adSoyad =adSoyad;
        this.dogumYili = dogumYili;
        this.adres = String.valueOf(adres);

    }

    @Override
    public String toString() {
        return "Personal{" +
                "adSoyad='" + adSoyad + '\'' +
                ", dogumYili=" + dogumYili +
                ", adres='" + adres + '\'' +
                ", milliyet='" + milliyet + '\'' +
                '}';
    }
}
