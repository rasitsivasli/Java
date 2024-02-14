package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_arraylist7_IkiArraydakiOrtakDegerleriDöndürme_HocaninCozumundenTekrarBak {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(8, 7, 9, 6, 7));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(6, 7, 12, 3, 1));
        System.out.println("common_values(arrayList1, arrayList2) = " + common_values(arrayList1, arrayList2));
    }

    private static ArrayList<Integer> common_values(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        ArrayList<Integer> arrayListOrtak = new ArrayList<>();// ortak elemanlar icin yeni ArrayList
        for (int i = 0; i < arrayList1.size(); i++) {//ortak eleman varmi bulmak icin cift for yapildi
            for (int i1 = 0; i1 < arrayList2.size(); i1++) {
                if (arrayList1.get(i).equals(arrayList2.get(i1))){// ortak eleman araniyor
                    if (!arrayListOrtak.contains(arrayList1.get(i))){/*eger bulunan ortak eleman yeni list de yoksa yaziliyor.
                                                                       Bu birden fazla yazmanin önüne gecmek icin yapildi*/
                        arrayListOrtak.add(arrayList1.get(i));// Bos olan list e ortak sayilar eklendi..
                    }
                }
            }
        }
        return arrayListOrtak;
    }


}
