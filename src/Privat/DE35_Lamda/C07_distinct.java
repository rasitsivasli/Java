package Privat.DE35_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_distinct {
    /*
    Distinct:
   Stream i�erisinde bulunan ve tekrar eden elemanlar varsa
    bunlar? distinct metodu ile �?kartabilir ve
   elimizde tekrar etmeyen birbirinden farkl?
   elemanlar bar?ndan bir veri setimiz kal?r
    */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(58, 7, 54, 46, 54, 7, 38, 7, 7, 61, 46, 45, 25, 16));
        System.out.println(list);
        list = list.stream().distinct().toList();
        System.out.println(list);
    }
}
