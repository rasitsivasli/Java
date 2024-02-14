package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1_ElamaninKacKezTekrarlama {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Orange", "Kiwi", "Peach", "Banana", "Orange"));

        String str = "Orange";
        System.out.println("getCount(arrayList, str) = " + getCount(arrayList, str));

    }

    private static int getCount(ArrayList<String> arrayList, String str) {
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {

            if (str.equals(arrayList.get(i))) {
                count++;
            }
        }
        return count;
    }


}
