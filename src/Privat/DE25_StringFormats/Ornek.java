package Privat.DE25_StringFormats;

import java.util.SplittableRandom;

public class Ornek {
    public static void main(String[] args) {
        String str = "Merhaba";
        String str1 = String.format(".%10s.",str);// bu saga dayali yaziyor
        System.out.println("str1 = " + str1);

        System.out.printf("str2 :"+".%-10s.%n",str );// sout icinde de kullanilabilir
        String str3 = String.format(".%-10S.",str);// buyuk harfle yaziyor
        System.out.println("str3 = " + str3);

        int sayi = 123456789;
        String str4 = String.format(".%2d.",sayi);// direkt Stringe ceviriyor.... %2 ayrilan yer demektir
                                                  // ayrilan yer String uz. kücükse direkt String uz. alir
        System.out.println("str4 = " + sayi);

        String str5 = String.format(".%-16s.",sayi);// bu saga dayali yaziyor
        System.out.println("str5 = " + str5);

        double db = 3.456789;
        String str6 = String.format("%f",db);// float oder double de olsa f yaziyoruz
        System.out.println("str6 = " + str6);

        String str7 = String.format("%10.2f",db);// 10 luk yer ayir 2 tanesi virgülden sonra olsun demek
        System.out.println("str7 = " + str7);
    }
}
