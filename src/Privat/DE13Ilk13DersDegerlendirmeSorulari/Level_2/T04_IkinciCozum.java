package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

public class T04_IkinciCozum {
    public static void main(String[] args) {
        // Aşağıdaki stringin harfleri bir büyük bir küçük olacak şekilde yazdırın
        // string değiştiğinde de proğram çalışmalı, boşlukları es geçin
        // String str = "merhaba arkadaşlar"
        // output str = "MeRhAbA aRkAdAşLaR" şeklinde yazmalı

        String str = "merhaba arkadaşlar";
        String yeniStr = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                yeniStr += ' '; // Boşlukları es geç
            } else if (i % 2 == 0) {
                yeniStr += Character.toUpperCase(ch);
            } else {
                yeniStr += Character.toLowerCase(ch);
            }
        }

        System.out.println("yeniStr = " + yeniStr);

    }
}






