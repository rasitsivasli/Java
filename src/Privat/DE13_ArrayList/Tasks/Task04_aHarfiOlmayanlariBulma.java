package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04_aHarfiOlmayanlariBulma {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ ve 'Baba'  harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        String [] arr = {"Ali","Veli","Ayse","Fatma","Omer"};
        ArrayList<String> isimList = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> aOlmayanIsimList = new ArrayList<>();//a olmayan isimlerin ekleneceği boş list tanımlandı

        aOlmayan(isimList, aOlmayanIsimList);
    }

    private static void aOlmayan(ArrayList<String> isimList, ArrayList<String> aOlmayanIsimList) {
        for (int i = 0; i < isimList.size(); i++) {
            String eleman = isimList.get(i);
            if (!eleman.toLowerCase().contains("a")) aOlmayanIsimList.add(eleman);
        }
        System.out.println("aOlmayanIsimList = " + aOlmayanIsimList);

    }
}
