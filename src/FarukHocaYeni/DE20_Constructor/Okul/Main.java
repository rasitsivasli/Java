package FarukHocaYeni.DE20_Constructor.Okul;

import DE20_Constructor.Okul.Kisi;

public class Main {
    public static void main(String[] args) {
        DE20_Constructor.Okul.Kisi sahis = new Kisi("ayse","adres 1");
        Ogretmen oMen=new Ogretmen(sahis,"matematik");
    //    oMen = new Ogretmen(new Not("ogrenci ad","ogr adres"),"67825");

        Ogrenci ogr = new Ogrenci("67825");

        System.out.println(oMen);
        System.out.println(ogr);

    }
}
