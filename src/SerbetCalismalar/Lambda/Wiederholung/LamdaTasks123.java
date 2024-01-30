package SerbetCalismalar.Lambda.Wiederholung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaTasks123 {

    public static void main(String[] args) {
        // S1:listi aralarinda bosluk birakarak yazdiriniz
// S2: sadece negatif olanlari yazdir
// S3: pozitif olanlardan yeni bir liste olustur
// S4: list in elemanlarin karelerinden yeni bir list olusturalim
// S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
// S6: listin elemanlarini kucukten buyuge siralayalim
// S7: listin elemanlarini buyukten kucuge siralayalim
// S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
// S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
// S10 :list elemanlarini toplamini bulalim
// S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
/*
             peek () 'in Javadoc sayfas? ?öyle diyor: " Bu yöntem, temelde, ö?eleri bir
            ard???k düzen içinde belirli bir noktadan geçerken görmek istedi?iniz
            yerde hata ay?klamay? desteklemek için vard?r . Ara islemdir.. yapilam islemi gormek icin kullanilir
*/
// S12 : listede 5 den buyuk  sayi var mi?
// S13 : listenin tum elemanlari sifirdan kucuk mu?
// S14: listenin 100 e esit elemani yok mu ?
// S15: listenin sifira esit elemani yok mu?
// S16:  listenin ilk 5 elemanini topla?
// S17: listenin son bes elemaninin  listele

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        // S1:listi aralarinda bosluk birakarak yazdiriniz
        printEachListe(list);
        negatifSayilar(list2);
        List<Integer> listNegatif = negatifSayilariBaskaBirListedeTopla(list);
        System.out.println("listNegatif = " + listNegatif);
        pozitifListeOlustur(list);


    }

    private static List<Integer> negatifSayilariBaskaBirListedeTopla(List<Integer> list) {
        System.out.println();
        return list.stream().filter(p -> p < 0).toList();
    }

    private static void pozitifListeOlustur(List<Integer> list) {
        list.stream().map(p->p>0 );

    }

    private static void printEachListe(List<Integer> list) {
        System.out.println();
        list.forEach(p -> System.out.print(p + " "));
        System.out.println();
        //2. Yol
        Consumer<List> printEach = System.out::println;
        printEach.accept(list);

    }

    private static void negatifSayilar(List<Integer> list) {
        System.out.println();
        System.out.println("Sadece negatifler olanlar : " + list.stream().filter(p -> p < 0).toList());
        //2.yol
        list.stream().filter(p -> p < 0).forEach(p -> System.out.print(p + " "));
    }


}
