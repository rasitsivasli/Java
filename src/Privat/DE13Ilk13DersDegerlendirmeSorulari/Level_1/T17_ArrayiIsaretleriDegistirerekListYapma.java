package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.ArrayList;
import java.util.List;

public class T17_ArrayiIsaretleriDegistirerekListYapma {
    public static void main(String[] args) {
        /*  verilen arrayin işaretlerini değiştirerek arrayliste aktarın(eksiler artı, artılar eksi olsun)

         */

        int[] arr = {21, -7, 46, -9, 44, 2, 1, 80};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(-1 * arr[i]);
        }
        System.out.println("list = " + list);

    }
}
