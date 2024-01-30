package SerbetCalismalar.Lambda.Wiederholung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaTasks789 {

    public static void main(String[] args) {

// S7: listin elemanlarini buyukten kucuge siralayalim
// S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
// S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim


        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        List<Integer> buyuktenKucuge = buyuktenKucuge(list);
        System.out.println("buyuktenKucuge = " + buyuktenKucuge.reversed());
        List<Integer> pozitiflerinKareleriBesIleBaslayanlar = pozitiflerinKareleriBesIleBaslayanlar(list);
        System.out.println("pozitiflerinKareleriBesIleBaslayanlar = " + pozitiflerinKareleriBesIleBaslayanlar);
        List<Integer> pozitiflerinKareleriBesIleBaslamayanlar = pozitiflerinKareleriBesIleBaslamayanlar(list);
        System.out.println("pozitiflerinKareleriBesIleBaslamayanlar = " + pozitiflerinKareleriBesIleBaslamayanlar);
    }

    private static List<Integer> pozitiflerinKareleriBesIleBaslamayanlar(List<Integer> list) {
        return list.stream().filter(p -> p > 0).map(p-> (int) Math.pow(p,2)).filter(p->p%10!=5).toList();
    }

    private static List<Integer> pozitiflerinKareleriBesIleBaslayanlar(List<Integer> list) {
        return list.stream().filter(p -> p > 0).map(p-> p= (int) Math.pow(p,3)).filter(p->p%10==5).toList();


    }

    private static List<Integer> buyuktenKucuge(List<Integer> list) {

        return list.stream().sorted().toList();
    }

}
