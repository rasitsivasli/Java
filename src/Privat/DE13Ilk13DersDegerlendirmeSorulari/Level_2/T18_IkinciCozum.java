package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T18_IkinciCozum {
    /* rastgele 20 elemanlı  bir ArrayList üretin  (sayılar 1 ila 100 arasında olsun)
    bu arrayList in  en küçük 2.elemanını ve kaçıncı sırada olduğunu bulunuz

     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) ((Math.random() * 100) + 1));
        }
        System.out.println("list = " + list);
        int enKucuk = Integer.MAX_VALUE;
        int enKucukIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < enKucuk) {
                enKucuk = list.get(i);
                enKucukIndex = i;
            }
        }
        int temp = 100;
        list.set(enKucukIndex,temp);
        int enKucukIkinci = Integer.MAX_VALUE;
        int enKucukIkinciIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < enKucukIkinci) {
                enKucukIkinci = list.get(i);
                enKucukIkinciIndex = i;
            }

        }
        System.out.println("enKucukIkinciIndex = " + enKucukIkinciIndex);


    }
}
