package Privat.DE20_Constructor.Tasks.PersonetKayit;

public class Adres {
    // bir B_Musteriler clası oluşturun, cadde,postaKodu,şehir,kapıNo alanları olsun
    // Ayrıca bir personel clası olusturun , bu class adSoyad,dogumYılı ve adres alanlarından oluşsun
    // AnaClass da constractor yardımı , PersonelClass tan oluş bir ArrayListe veriler atın

    String cadde;
    int postaKodu;
    String sehir;
    int kapiNo;

    public Adres() {
    }

    public Adres(String cadde, int postaKodu, String sehir, int kapiNo) {
        this.cadde = cadde;
        this.postaKodu = postaKodu;
        this.sehir = sehir;
        this.kapiNo = kapiNo;
    }

    @Override
    public String toString() {
        return "B_Musteriler{" +
                "cadde='" + cadde + '\'' +
                ", postaKodu=" + postaKodu +
                ", sehir='" + sehir + '\'' +
                ", kapiNo=" + kapiNo +
                '}';
    }
}
