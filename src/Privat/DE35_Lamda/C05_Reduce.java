package Privat.DE35_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Reduce {
     /*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullan?m? yayg?nd?r pratiktir.
        Bir Stream içerisindeki verilerin teker teker i?lenmesidir. Teker teker i?leme sürecinde,
        bir önceki ad?mda elde edilen sonuç bir sonraki ad?ma girdi olarak sunulmaktad?r.
        Bu sayede y???l?ml? bir hesaplama süreci elde edilmi? olmaktad?r.
        reduce metodu ilk parametrede identity de?eri, ikinci parametrede ise BinaryOperator türünden bir obj kullan?l?r.
        reduce i?leminde bir önceki hesaplanm?? de?er ile s?radaki de?er bir i?leme tabi tutulmaktad?r.
        ??leme ba?larken bir önceki de?er olmad??? için bu de?er identity parametresinde tan?mlanmaktad?r.

        */
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));
         // dizinin toplam?n? bulal?m
         int toplam = list.stream().reduce(0,(top,p)->top+p);   System.out.println(toplam);

         toplam = list.stream().reduce(0,Integer::sum);         System.out.println(toplam);// en iyisi
         toplam = list.stream().reduce(Integer::sum).get();            System.out.println(toplam);



       /* yukar?daki bunun ayn?s?
         int toplam2=0;
         for (int i = 0; i < list.size() ; i++) toplam2= toplam + list.get(i);
         */

         int enBuyuk = list.stream().reduce(list.getFirst(),(eb,p)->eb>p? eb:p); System.out.println(enBuyuk);
         enBuyuk = list.stream().reduce(list.getFirst(),Integer::max);   System.out.println(enBuyuk);
         enBuyuk = list.stream().reduce(list.getFirst(),Math::max);      System.out.println(enBuyuk);
         enBuyuk = list.stream().reduce(Integer::max).get();             System.out.println(enBuyuk);

         enBuyuk = list.stream().reduce(list.getFirst(),Integer::max);
         int[] arr = {1,5,2,7,3,5};
         // arr nin toplam?n? bulal?m
         int arrToplam = Arrays.stream(arr).sum();

         // list i array a çevirelim
         int[] arr2 = list.stream().mapToInt(p->p).toArray();



     }
}
