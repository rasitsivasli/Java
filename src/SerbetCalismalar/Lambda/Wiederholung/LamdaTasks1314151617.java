package SerbetCalismalar.Lambda.Wiederholung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaTasks1314151617 {

    public static void main(String[] args) {

// S13 : listenin tum elemanlari sifirdan kucuk mu?
// S14: listenin 100 e esit elemani yok mu ?
// S15: listenin sifira esit elemani yok mu?
// S16:  listenin ilk 5 elemanini topla?
// S17: listenin son bes elemaninin  listele

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        // allMatch bize teker teker elamanlari dolasip sonra true oder false olarak gönderir
        System.out.println("list.stream().allMatch(p -> p < 0) = " + list.stream().allMatch(p -> p < 0));

        // any Match herhangi bir eslesme demektir
        // none Match hicbir eslesme demek
        // all Match tum eslesme demek


        // listede elemanlardan biri 100 e esit se true veriri
        System.out.println("list.stream().noneMatch(p-> p==100) = " + list.stream().noneMatch(p -> p != 100));
        System.out.println("list.stream().noneMatch(p-> p==0) = " + list.stream().noneMatch(p -> p != 0));

        // S16:  listenin ilk 5 elemanini topla?
        int ilkBesSayi =  list.stream().limit(5).reduce(0, (top,p)->(top+p));
        System.out.println("Ilk bes elemani topla = " +ilkBesSayi);

        System.out.println("son 5 sayi = " + list.stream().skip((list.size()-5)).toList());// skip atlamak demek
    }


}
