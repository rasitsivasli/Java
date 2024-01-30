package SerbetCalismalar.Lambda.Wiederholung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaTasks101112 {

    public static void main(String[] args) {

// S10 :list elemanlarini toplamini bulalim
// S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
/*
             peek () 'in Javadoc sayfas? ?öyle diyor: " Bu yöntem, temelde, ö?eleri bir
            ard???k düzen içinde belirli bir noktadan geçerken görmek istedi?iniz
            yerde hata ay?klamay? desteklemek için vard?r . Ara islemdir.. yapilam islemi gormek icin kullanilir
*/
// S12 : listede 5 den buyuk  sayi var mi?

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        int sum = sumListe(list);
        System.out.println("sum = " + sum);
        System.out.println("karePeek(list) = " + karePeek(list));
        System.out.println("bestenBuyukSayilar(list) = " + bestenBuyukSayilar(list));

        boolean anyMatchBigger = anyMatch5(list);
        System.out.println("anyMatchBigger = " + anyMatchBigger);
        System.out.println("list.removeIf(p-> p>5) = " + list.removeIf(p -> p > 5));// RemoveIf bize 5 den buyuk varsa sile ve true döner
        // yoksa false olarak gönderir


    }

    private static boolean anyMatch5(List<Integer> list) {
        return list.stream().anyMatch(p-> p>5);
    }

    private static List<Integer> bestenBuyukSayilar(List<Integer> list) {
        return list.stream().filter(p -> p > 5).toList();
    }

    private static int sumListe(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }

    private static List<Integer> karePeek(List<Integer> list) {
        return list.stream().filter(p -> p < 0).peek(p -> System.out.println("Negatif sayi : " + p)).
                map(p -> (int) Math.pow(p, 2)).peek(p -> System.out.println("Kareleri : " + p)).toList();
    }

}
