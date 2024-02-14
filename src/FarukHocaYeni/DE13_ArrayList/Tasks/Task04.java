package DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ ve 'Baba'  harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> isimList = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        //a olmayan isimlerin ekleneceği boş list tanımlandı


      //  yontem1(isimList);
        isimList = yontem2(isimList);
        System.out.println("isimList = " + isimList);
    }

    private static ArrayList<String> yontem2(ArrayList<String> isimList) {
        ArrayList<String> aOlmayanIsimList = new ArrayList<>();
        for (int i = 0; i <isimList.size() ; i++) {
            String eleman = isimList.get(i);
            if (!eleman.toLowerCase().contains("a")) aOlmayanIsimList.add(eleman);
        }
        return aOlmayanIsimList;
    }

    private static void yontem1(ArrayList<String> isimList) {
        for (int i = 0; i <isimList.size() ; i++) {
            String eleman = isimList.get(i);
            // eleman = eleman.replace("a","").replace("Baba","");
            if (eleman.toLowerCase().contains("a")) {
                isimList.remove(eleman);
                i--;
            }
        }
        System.out.println("isimList = " + isimList);
    }
}
