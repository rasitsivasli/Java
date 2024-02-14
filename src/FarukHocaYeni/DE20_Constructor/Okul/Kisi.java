package DE20_Constructor.Okul;

public class Kisi {
    String adSoyad;
    String adres;

    public Kisi() {
    }

    public Kisi(String adSoyad, String adres) {
        this.adSoyad = adSoyad;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Not{" +
                "adSoyad='" + adSoyad + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
