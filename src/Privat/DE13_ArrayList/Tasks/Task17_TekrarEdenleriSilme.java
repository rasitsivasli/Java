package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task17_TekrarEdenleriSilme {
    public static void main(String[] args) {
        // Task->  verilen bir listede tekrar eden sayilari sadece 1 kez print eden METHOD create ediniz
        // input : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7));

        tekrarlariSil(list);


    }//main sonu

    private static void tekrarlariSil(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
        System.out.println("list = " + list);

    }
}


//class sonu
