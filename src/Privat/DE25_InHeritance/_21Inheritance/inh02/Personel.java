package soru_cevap._21Inheritance.inh02;


public class Personel {
    public static int sayac=1000;
    public int id;
    public String isim;
    public String soyIsim;
    public String adres;
    public String tel;

    public int idAta() {
        return this.id=++sayac;
    }

}
