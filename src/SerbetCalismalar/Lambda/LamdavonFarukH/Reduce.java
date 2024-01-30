package SerbetCalismalar.Lambda.LamdavonFarukH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));


        int toplam = list.stream().reduce(0, (top, p) -> top + p); //burada tüm sayilar toplandi
        System.out.println("toplam = " + toplam);
        int carpim = list.stream().reduce(1, (top, p) -> top * p); //burada tüm sayilar carpildi
        System.out.println("carpim = " + carpim);
        int enBuyuk = list.stream().reduce(list.getFirst(), (enB, p) -> enB > p ? enB : p);
        System.out.println("enBuyuk = " + enBuyuk);
        List<Integer> list3 = list.stream().limit(10).skip(5).toList();
        System.out.println("list3 = " + list3);
    }


}
