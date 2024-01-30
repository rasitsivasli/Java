package Privat.DE35_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_sort {
    /*
   Sorted:
   Baz? durumlarda elimizde ki veri setini belirli bir parametreye göre s?ralamak isteyebiliriz.
           2 türü bulunmaktad?r. Birinci hali parametre almaz küçükten büyü?e ?ekilde s?ralar.
   ?kinci format? ise Comparator arayüzünden türedi?i için
   bizim belirlemi? oldu?umuz parametreye göre s?ralama i?lemi yapar.
    */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));
        System.out.println(list);
        list  =list.stream().sorted().toList(); // kucukten buyuye s?ralad?k
        System.out.println(list);
        list = list.stream().sorted(Comparator.reverseOrder()).toList();// buyukten kucuge s?ralad?k
        System.out.println(list);
        // Collections.sort(list);

    }
}
