package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.ArrayList;
import java.util.List;

public class T02_DiziKullanmadanRandomdanUretilenSayilarinEnBuyugu {
    public static void main(String[] args) {
        // rastgele 1 ile 20 arasında 100 adet sayı üretin ve en büyüğünü dizi kullanmadan bulun

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) ((Math.random() * 20)+1));
        }
        System.out.println("list = " + list);
        int enBuyuk = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > enBuyuk) enBuyuk = list.get(i);

        }
        System.out.println("enKucuk = " + enBuyuk);
    }
}
