package Privat.DE20_Constructor.Tasks.AdresKayit;

import java.util.ArrayList;

public class AnaClass {
    // bir B_Musteriler clası oluşturun, cadde,postaKodu,şehir,kapıNo alanları olsun
    // Ayrıca bir personel clası olusturun , bu class adSoyad,dogumYılı ve adres alanlarından oluşsun
    // AnaClass da constractor yardımı , PersonelClass tan oluş bir ArrayListe veriler atın
    public static void main(String[] args) {
        ArrayList<Person> liste = new ArrayList<>();
        Adres adres = new Adres("Bey cd", 2045, "Berlin", "12A");
        Person kisi = new Person("Hasan Taş", 2000, adres);
        liste.add(kisi);
        kisi = new Person("Metmet Yerbakan", 1970,
                new Adres("kkk caddesi", 9786, "Köln", "10C"));
        liste.add(kisi);
        kisi = new Person("Mehmet bakan", 1950,
                new Adres("Duseldorf", 9726, "Oslo", "11A"));
        liste.add(kisi);
        for (int i = 0; i < liste.size(); i++) {
            kisi = liste.get(i);
            System.out.println(kisi);
        }
        System.out.println("*******Birinci yol*******");
        // Listeyi yazdırın adSoyad, şehir
        for (int i = 0; i < liste.size(); i++) {
            kisi = liste.get(i);
            System.out.println(kisi.adSoyad+" "+kisi.adres.city);
        }
        System.out.println("*******ikinci yol*********");

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i).adSoyad+" "+ liste.get(i).adres.city);
        }

    }

}
