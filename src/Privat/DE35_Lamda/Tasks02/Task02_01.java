package Privat.DE35_Lamda.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task02_01 {
    /*
    Stream içerisinde sadece reduce kullanarak list içerisindeki tek say?lar?n toplam?n?
bulunuz
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(58, 7, 54, 46, 54, 7, 38, 7, 7, 61, 46, 45, 25, 16));
        System.out.println(list);
        int toplam = list.stream().reduce(0, Integer::sum);
        System.out.println("Tüm sayilar toplami = " + toplam);

        int tekSayilarToplami = list.stream().filter(p -> p % 2 == 1).reduce(0, Integer::sum);
        System.out.println("tekSayilarToplami = " + tekSayilarToplami);

        int ciftSayilarToplami = list.stream().filter(p -> p % 2 == 0).reduce(0, Integer::sum);
        System.out.println("ciftSayilarToplami = " + ciftSayilarToplami);

        //// 2. yol

        int tekSayilarToplami2 = list.stream().reduce(0, (tekToplam, p) -> p % 2 == 1 ? tekToplam + p : tekToplam);
        System.out.println("tekSayilarToplami2 = " + tekSayilarToplami);
    }
}
