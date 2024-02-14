package FarukHocaYeni.DE20_Constructor.Okul;

import Privat.DE20_Constructor.Tasks.Okul.Not;

public class Ogrenci {
    Not kimlik;
    String oNo;

    public Ogrenci() {
    }

    public Ogrenci(Not kimlik, String oNo) {
        this.kimlik = kimlik;
        this.oNo = oNo;
    }

    public Ogrenci(String number) {
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "kimlik=" + kimlik +
                ", oNo='" + oNo + '\'' +
                '}';
    }
}
