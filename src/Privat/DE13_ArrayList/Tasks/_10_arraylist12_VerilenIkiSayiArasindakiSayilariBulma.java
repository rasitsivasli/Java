package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _10_arraylist12_VerilenIkiSayiArasindakiSayilariBulma {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 5, 22, 10, 20, 14, 8, 25, 30, 28));

        int min = 20;
        int max = 30;

        System.out.println("rangeBtw( arrayList,min,max) = " + rangeBtw(arrayList, min, max));


    }

    private static int rangeBtw(ArrayList<Integer> arrayList, int min, int max) {
        int count = 0;
        List <Integer> newList = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)>=20 && arrayList.get(i)<=30){
               count++;
              newList.add(arrayList.get(i));

            }

        }

        Collections.sort(newList);
        System.out.println("newList = " + newList);
        System.out.println("Collections.max(newList) = " + Collections.max(newList));
        newList.remove(newList.getFirst());
        System.out.println("----------");
        System.out.println("newList = " + newList);
        System.out.println("newList.getLast() = " + newList.getFirst());
        Collections.reverse(newList);
        System.out.println("newList tersten siralandi = " + newList);


        return count;
    }


}