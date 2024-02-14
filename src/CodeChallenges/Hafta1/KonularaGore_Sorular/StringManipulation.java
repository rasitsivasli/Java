package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "Java Candir";
        System.out.println(str.length());

//        son harfi yazdirmak icin

        System.out.println(str.charAt(str.length()-1));

        //9. harfi büyük yazdir..

        System.out.println(str.toUpperCase().charAt(10));
        String isim = "ben seninbenisevebilmeihtimalinisevdim";

        System.out.println("Sondan 4. harfin büyük hali  : "+ isim.toUpperCase().charAt(isim.length()-5));

//        kullaicidan alinan ismin ortadaki hardfi yazdirin


        System.out.print("Lütfen isminizi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        String ad = scanner.next();

        if ((ad.length())%2==0){
            System.out.println("Ismin tam ortasinda harf yok");
        } else {
            System.out.println(ad.charAt((ad.length()-1)/2));

        }
    }
}
