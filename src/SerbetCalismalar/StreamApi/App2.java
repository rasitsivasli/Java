package SerbetCalismalar.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App2 {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList
                (11, 12, 7, 32,7 ,32, 41, 41, 32, 68, 41, 12, 7, 41, 43, 24, 32));

      /*  List<String> yeniList = list.stream().map(p -> p%2 ==0 ?"cift "+p:"tek "+p).toList();
        System.out.println(yeniList);*/

        List<String> yeniList2 =new ArrayList<>();
        list.stream().map(p -> p%2 ==0 ?"cift "+p:"tek "+p).forEach(yeniList2::add);
        System.out.println(yeniList2);

        list.stream().map(p -> ciftTek(p)).forEach(System.out::println);// eski hali
        list.stream().map(App2::ciftTek).forEach(System.out::println);// yeni hali, ayni anlama geliyor
        int toplam = list.stream().mapToInt(p->p).sum();// toplami bulur
        int enBuyuk = list.stream().mapToInt(p->p).max().getAsInt();// en büyük sayiyi bulur
        System.out.println(enBuyuk);

    }

    private static String ciftTek(Integer p) {
        return p%2 ==0 ?"cift "+p:"tek "+p;
    }
}
