package Privat.DE24_Encapsulation.Ornek.Ciftlik;

public class Ciflik {

    private String cins;
    private int yas;
    private int ayakSayisi;// ayak sayisi 2 yada 4 degilse yanlis girsin uyarisi versin

    public Ciflik() {
    }

    public Ciflik(String cins, int yas, int ayakSayisi) {
        setAyakSayisi(ayakSayisi);
        this.ayakSayisi=ayakSayisi;


    }

    @Override
    public String toString() {
        return "Ciflik{" +
                "cins='" + cins + '\'' +
                ", yas=" + yas +
                ", ayakSayisi=" + ayakSayisi +
                '}';
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        if (!(ayakSayisi == 2 || ayakSayisi == 4)) {
            System.out.println("Ayak sayisi 2 veya 4 olmali");
        }
    }
}
