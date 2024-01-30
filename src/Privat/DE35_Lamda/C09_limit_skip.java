package Privat.DE35_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_limit_skip {
     /*  Limit(n)
    Elimizde var olan bir veri kayna??n?, göstermek istedi?imiz kadar?n? göstermemize
    yarayan, s?n?rland?ran bir metoddur. Parametre olarak verece?imiz rakamla asl?nda
    Stream içerisinde dönen çok say?da veri var
    ancak sen bize ?u kadar?n? göster diyoruz.
skip(1) => atlama demek. Ak???n ilk n eleman?n? att?ktan sonra bu ak???n
    kalan elemanlar?ndan olu?an bir ak?? döndürür. Bu ak?? n'den daha az ö?e içeriyorsa,
    bo? bir ak?? döndürülür. Bu, durum bilgisi olan bir ara i?lemdir.
    skip(list.size()-1) => List’in uzunlu?unun 1 eksi?ini yazarsak son eleman? yazd?r?r?z.

     */
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));
         System.out.println(list);
         List<Integer> list2 = list.stream().limit(10).toList();
         System.out.println(list2);
         List<Integer> list3 = list.stream().skip(10).toList();
         System.out.println(list3);

     }
}
