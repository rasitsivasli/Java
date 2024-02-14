package FarukHocaYeni.DE20_Constructor.Okul;

import Privat.DE20_Constructor.Tasks.Okul.Not;

public class Ogretmen {
    Not kimlik;
    String brans;

    public Ogretmen() {
    }

    public Ogretmen(Not kimlik, String brans) {
        this.kimlik = kimlik;
        this.brans = brans;
    }

    public Ogretmen(DE20_Constructor.Okul.Kisi sahis, String matematik) {
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "kimlik=" + kimlik +
                ", brans='" + brans + '\'' +
                '}';
    }
}
