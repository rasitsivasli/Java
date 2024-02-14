package Privat.DE20_Constructor.Tasks.PersonetKayit;

import java.util.ArrayList;

public class AnaClass {
    // bir B_Musteriler clası oluşturun, cadde,postaKodu,şehir,kapıNo alanları olsun
    // Ayrıca bir personel clası olusturun , bu class adSoyad,dogumYılı ve adres alanlarından oluşsun
    // AnaClass da constractor yardımı , PersonelClass tan oluş bir ArrayListe veriler atın

    public static void main(String[] args) {
        ArrayList<Personal> bilgiler = new ArrayList<>();
        Adres adres = new Adres("Friedenstraße",67657,"Kaiserslautern",109);
        Personal kisi = new Personal("Rasit Sivasli",1900,adres); bilgiler.add(kisi);

        System.out.println("bilgiler = " + bilgiler);
        System.out.println("kisi = " + kisi);

    }
}
