package Privat.DE15_Varargs;

import java.util.ArrayList;
import java.util.List;

public class Task03_IkinciCozumeHocadanBak {
    public static void main(String[] args) {
         /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
         */

        int sayi1 = 7;
        String str1 = "sefil javacı Haluk";//
        List<String> list1 = new ArrayList<>(List.of(str1.split(" ")));
        String str2 = "perfect javacı Abdulhamit";//
        List<String> list2 = new ArrayList<>(List.of(str2.split(" ")));
        String str3 = "beleştepe muhtarı CEREN";//
        List<String> list3 = new ArrayList<>(List.of(str3.split(" ")));


        enUzunHarfSayisi(sayi1, list1, list2, list3);
        metot2(sayi1, str1, str2, str3);
    }//main sonu

    private static void metot2(int sayi1, String... strings) {
        int enUzun = 0;
        for (String kelime : strings) {

            if (kelime.length() > enUzun) enUzun = kelime.length();

        }
        System.out.println("enUzunStringUzunluk = " + (enUzun * sayi1));
    }

    private static void enUzunHarfSayisi(int sayi1, List<String>... listeler) {
        int enUzunStringUzunluk = 0;
        for (List<String> list : listeler) {
            for (String kelime : list) {
                if (kelime.length() > enUzunStringUzunluk) enUzunStringUzunluk = kelime.length();
            }
        }
        System.out.println("enUzunStringUzunluk = " + (enUzunStringUzunluk * sayi1));

    }


}
