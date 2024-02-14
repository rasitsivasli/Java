package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiszYerDegistirme {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        // 1. ve 3. index i tek satirda yapiyoruz
        System.out.println("list = " + list);
        list.set(3, list.set(1, list.get(3)));// array list de yer degistirme..
        // ArrayList de set metodu islemden sonra geriye elemanin degisimden onceki halini remove deki gibi verir.
        // Dolayisiyla tekrar atama yapabiliriz
        System.out.println("list = " + list);
    }
}
