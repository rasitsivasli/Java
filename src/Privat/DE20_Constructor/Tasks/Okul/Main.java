package Privat.DE20_Constructor.Tasks.Okul;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

        Not rasitNotlar = new Not(90,80,70);
        Not suatNotlar = new Not(80,90,60);
        Ogrenci rasit = new Ogrenci("Rasit Sivasli","Kaiserslautern",40,170,rasitNotlar);
        Ogrenci suat = new Ogrenci("Suat Sivasli","Mainz",13,165,suatNotlar);

        ogrenciler.add(rasit);
        System.out.println("ogrenciler = " + ogrenciler);
        ogrenciler.add(suat);
        System.out.println("ogrenciler = " + ogrenciler);
        for (Ogrenci w: ogrenciler) {
            System.out.println("w = " + w);
            System.out.println();
        }








    }
}
