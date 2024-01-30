package Privat.DE35_Lamda;

import java.util.ArrayList;
import java.util.List;

public class Task00 {
     /* Rastgele 20 Integer(1 den 100 e kadar) elemandan olu?an bir List yap?n
    a) Bu list in (stream kullanarak) tek  elemanlar?n? yazd?r?n
    b) Bu list in (stream kullanarak) tek  elemanlar?n? yazd?r?n (filter içinde motot kullan?n)


      */
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>();
         for (int i = 0; i < 20; i++) {
             int sayi = (int) (Math.random() * 100 + 1);
             list.add(sayi);
         }
         System.out.println(list);
         // a)
         System.out.println(" a) ");
         list.stream().filter(p -> p % 2 == 1).forEach(p -> System.out.print(p + " "));
         System.out.println("\n b) ");
         // b) esas cevab?
         list.stream().forEach(Task00::tekseYazdir);
         // veya b) filter içerisinde bir metot ça??r?yorsak boolean return tipi olmak zorunda
         System.out.println("\nb)2");
         list.stream().filter(Task00::tekseYazdir2).forEach(p -> System.out.print(p + " "));
         System.out.println("\n------------");

         list.stream().filter(Task00::tekseYazdir2).map(p->p+1);

         // sonuc, filter sadece filtreleme, map sadece i?lemden geçirme içindir, farkl? bir amaç ile kullanmayal?m


     }

    public static void tekseYazdir(int p) {
        if (p % 2 == 1) System.out.print(p + " ");
    }

    public static boolean tekseYazdir2(int p) {
        if (p % 2 == 1) {
            System.out.print(p + " ");
            return true;
        } else return false;
    }
}

