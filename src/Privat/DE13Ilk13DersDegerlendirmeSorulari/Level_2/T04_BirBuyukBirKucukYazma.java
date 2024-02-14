package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.SplittableRandom;

public class T04_BirBuyukBirKucukYazma {
    public static void main(String[] args) {
        // Aşağıdaki stringin harfleri bir büyük bir küçük olacak şekilde yazdırın
        // string değiştiğinde de proğram çalışmalı, boşlukları es geçin
        // String str = "merhaba arkadaşlar"
        // output str = "MeRhAbA aRkAdAşLaR" şeklinde yazmalı

        String str = "merhaba arkadaşlar";
        boolean buyukSirasi = true;
        String yeniStr = "";
        for (int i = 0; i < str.length(); i++) {
            String harf = str.substring(i, i + 1);
            if (harf.equals(" ")){
                yeniStr=yeniStr+" ";
                continue;
            }
            if (buyukSirasi) {
                yeniStr = yeniStr + harf.toUpperCase();
                buyukSirasi = false;
            } else {
                yeniStr = yeniStr + harf.toLowerCase();
                buyukSirasi=true;
            }
        }
        System.out.println("yeniStr = " + yeniStr);

    }


}






