package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_arraylist8_IkinciEnBüyükSayi {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 3, 4, 6, 7, 7));
//        System.out.println("secondMax(arrayList) = " + secondMax(arrayList));
        System.out.println("secondMaxIkinciYol(arrayList) = " + secondMaxIkinciYol(arrayList));

    }

    private static int secondMaxIkinciYol(ArrayList<Integer> arrayList) {
        return secondMax(arrayList);
    }

    private static int secondMax(ArrayList<Integer> arrayList) {
        int enBuyuk = arrayList.getFirst();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > enBuyuk) {
                enBuyuk = arrayList.get(i);
            }
        }
        int ikinciEnBuyuk = arrayList.getFirst();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != enBuyuk && arrayList.get(i) > ikinciEnBuyuk) {
                ikinciEnBuyuk = arrayList.get(i);

            }
        }
        return ikinciEnBuyuk;

    }
}