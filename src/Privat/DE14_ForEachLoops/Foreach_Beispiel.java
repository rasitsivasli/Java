package Privat.DE14_ForEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreach_Beispiel {
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(16, 21, 33, 54, 15, 45, 58));


// DataType  dataName : data kaynagı
        for (Integer deger : sayiList) {//Integer type'de deger'a sayıList'in her bir elemanı atandı
            System.out.println(deger);
        }
        System.out.println();
// listin bir kısmını tarama ?
// litenin ilk 5 elemanını yazdıralım
        for (Integer eleman : sayiList.subList(0, 5)) {
            System.out.print(eleman + " ");
        }
// for each kullanarak liteyi,başka bir liste ters-çevirin#
        System.out.println();
        List<Integer> yeniList = new ArrayList<>();
        for (Integer deger : sayiList) {//Integer type'de deger'a sayıList'in her bir elemanı atandı
            yeniList.add(sayiList.getLast());
            sayiList.remove(sayiList.getLast());
            System.out.println("hata");
        } System.out.print(yeniList);
    }
}
