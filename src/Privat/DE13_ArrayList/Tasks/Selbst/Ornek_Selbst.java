package Privat.DE13_ArrayList.Tasks.Selbst;

import java.util.ArrayList;
import java.util.Arrays;

public class Ornek_Selbst {
    public static void main(String[] args) {
        // {1,2,5,4,9,11,2,33,3,2,4} dizideki tekrar eden elemanlari sadece bir kez yazdirin

        int[] arr = {1, 2, 5, 4, 9, 11, 2, 33, 3, 2, 4};
      ArrayList<Integer> arrTekrarsiz = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!arrTekrarsiz.contains(arr[i])){
                arrTekrarsiz.add(arr[i]);
            }

        }
        System.out.println("arrTekrarsiz = " + arrTekrarsiz);

        arr = new int[arrTekrarsiz.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=arrTekrarsiz.get(i);
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
