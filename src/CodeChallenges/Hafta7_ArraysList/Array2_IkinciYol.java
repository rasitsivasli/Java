package CodeChallenges.Hafta7_ArraysList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Array2_IkinciYol {
    public static void main(String[] args) { //    //1.adim str tanimladik



        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz
         * int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};

        List<Integer> list = new ArrayList<>();
        List<Integer> yenilist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addAll(i, Collections.singleton((arr[i])));
        }
        System.out.println("list = " + list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == 9)
                    System.out.println(list.get(i) + " ," + list.get(j));
            }
        }
        System.out.println("yenilist = " + yenilist);
    }
}
