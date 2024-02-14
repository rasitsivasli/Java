package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T04_RandomdanUretilenSayilarinEnBuyugu {
    public static void main(String[] args) {
        // rastgele 1 ile 20 arasında 100 adet sayı üretin ve
        // en büyüğünü ArrayList kullanarak bulun


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) ((Math.random() * 20)+1));
        }
        System.out.println("list = " + list);
        System.out.println("Collections.max(list) = " + Collections.max(list));
    }
}
