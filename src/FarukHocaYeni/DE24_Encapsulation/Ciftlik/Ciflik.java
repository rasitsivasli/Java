package FarukHocaYeni.DE24_Encapsulation.Ciftlik;

public class Ciflik {
    private String cins;
    private int yas;
    private int ayakSayisi;
    private boolean basari=true;

    public Ciflik(String cins, int yas, int ayakSayisi) {
        this.cins = cins;
        this.yas = yas;
       setAyakSayisi(ayakSayisi);
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
        if (!(ayakSayisi==2 || ayakSayisi==4)) basari=false;
        this.ayakSayisi = ayakSayisi;
    }

    public boolean isBasari() {
        return basari;
    }

    @Override
    public String toString() {
        return "Ciflik{" +
                "cins='" + cins + '\'' +
                ", yas=" + yas +
                ", ayakSayisi=" + ayakSayisi +
                '}';
    }
}
