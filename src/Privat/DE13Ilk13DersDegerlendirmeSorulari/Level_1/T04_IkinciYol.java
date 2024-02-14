package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T04_IkinciYol {
    public static void main(String[] args) {
        // rastgele 1 ile 20 arasında 100 adet sayı üretin ve
        // en büyüğünü ArrayList kullanarak bulun


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int sayi = (int) (Math.random() * 20) + 1;
            list.add(sayi);
        }
        int enBuyuk = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > enBuyuk) enBuyuk = list.get(i);
        }
        System.out.println("enBuyuk = " + enBuyuk);

    }
}
