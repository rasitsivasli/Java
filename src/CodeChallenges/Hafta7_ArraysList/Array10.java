package CodeChallenges.Hafta7_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) { //    //1.adim str tanimladik
/*
     If the list has 12 as element, change all 12s to 21
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */

        Integer[] arr = {12, 11, 12, 15, 12, 34, 43};
        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(arr));

        for (int i = 0; i < 3; i++) {

                list.set(list.indexOf(12), 21);
        }
        System.out.println("list = " + list);


    }
}



