package Privat.DE35_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_sort {
    /*
   Sorted:
   Baz? durumlarda elimizde ki veri setini belirli bir parametreye g�re s?ralamak isteyebiliriz.
           2 t�r� bulunmaktad?r. Birinci hali parametre almaz k���kten b�y�?e ?ekilde s?ralar.
   ?kinci format? ise Comparator aray�z�nden t�redi?i i�in
   bizim belirlemi? oldu?umuz parametreye g�re s?ralama i?lemi yapar.
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
