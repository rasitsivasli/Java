package Privat.DE15_Varargs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
         /*
        Task ->
        Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.

         */
        //   int sayiArr[] = {2,24, 23, 38, 33, 21, 59, 26, 10};
        System.out.println("toplaIlkSayiIleCarp(2, 24, 23, 38, 33, 21, 59, 26, 10) = " + toplaIlkSayiIleCarp(2, 24, 23, 38, 33, 21, 59, 26, 10));

    }//main sonu

    private static int toplaIlkSayiIleCarp(int... sayilar) {
        List<Integer> list = new ArrayList<>();
        int toplam = 0;
        for (int w : sayilar) {
            list.add(w);
        }
        System.out.println("list = " + list);
        for (Integer w : list) {
            toplam += w;
        }
        return (toplam-list.getFirst())* list.getFirst();
    }


}
