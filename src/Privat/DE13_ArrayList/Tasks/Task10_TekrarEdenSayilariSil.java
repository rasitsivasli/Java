package Privat.DE13_ArrayList.Tasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task10_TekrarEdenSayilariSil {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1));


        for (int i = 0; i < list.size(); i++) {
            int eleman = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).equals(eleman)) {

                    list.remove(j);
                }

            }
        }// tekrar list i array e ceviriyoruz
        System.out.println("list = " + list);

        arr = Arrays.copyOf(arr, list.size());
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }

}
