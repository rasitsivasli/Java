package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task15_AsalSayi {

    /* TASK :
    100 den kucuk asal sayilari print eden  code create ediniz.
     */
    public static void main(String[] args) {
        List<Integer> asalSayilar = new ArrayList<>();
        System.out.println("100'den küçük asal sayılar:");
        for (int i = 2; i < 100; i++) {
            if (asalSayi(i)) {
                asalSayilar.add(i);
            }
        }
        System.out.println("asalSayilar = " + asalSayilar);
    }

    private static boolean asalSayi(int i) {
        boolean flag = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
