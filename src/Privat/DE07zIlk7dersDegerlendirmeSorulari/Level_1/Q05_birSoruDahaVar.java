package Privat.DE07zIlk7dersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class Q05_birSoruDahaVar {
    public static void main(String[] args) {
        // Klavyeden isim ve soyisim tek variable olarak okunuyor giriliyor
        // isim ve soy ismi alt alta yazdırınız

        Scanner scanner = new Scanner(System.in);
        String isimSoyisim = "rasit sivasli";
        //// verilerin icinde kullanacagin ifadeleri daha önceden tanimlae, sout böylece daka anlasilir olur
        //////int doslukIndex = isimSoyisim.indexOf(" ")  gibi


        System.out.println(isimSoyisim.substring(0,isimSoyisim.indexOf(" ")));
        System.out.println(isimSoyisim.substring(isimSoyisim.indexOf(" ")+1));

        /// son harfler büyük olacak ve digerleri kücük olacak sekilde yazdir sorusunu kendin cöz...
    }
}
