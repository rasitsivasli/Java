package CodeChallenges.Hafta7_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) { //    //1.adim str tanimladik

       /*
    Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
    String s= "Apex,nesne yonelimli bir programlama dilidir"
                a e i o u */
        String str = "Apex,nesne yonelimli bir programlama dilidir";
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.addAll(List.of(str.replaceAll("\\W", "").split("")));
        System.out.println("list = " + list);
        String[] harf = {"a", "e", "i", "o", "u"};
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < harf.length; j++) {
                if (list.get(i).equalsIgnoreCase(harf[j])) {
                    count++;
                }
            }
        }

        System.out.println("count = " + count);
    }

}



