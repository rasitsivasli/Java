package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task05_EelmanlariHarfeGöreSiralama {
    public static void main(String[] args) {


         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String [][] arr = {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        List<String> list = new ArrayList<>();
        tekList(arr,list);
    }//main sonu

    private static void tekList(String[][] arr, List<String> list) {
        for (int i = 0; i < arr.length; i++) {
            list.addAll(Arrays.asList(arr[i]));// arr deki tüm elemanlar liste ataniyor
        }
        Collections.sort(list);
        System.out.println("list = " + list);
    }

}
