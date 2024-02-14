package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13_Tekrar_HocaninCozumuneBakarsin {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5, 7));
        List<Integer> newList = new ArrayList<>();
        ardisikToplam(list,newList);



    }

    private static void ardisikToplam(List<Integer> list, List<Integer> newList) {
        int i = 0;
        int toplam = 0;
        while (i<list.size()){
            toplam=0;
            for (int j = 0; j < i; j++) {
                toplam+=list.get(i);
                list.remove(i);
                newList.add(toplam);
            }
            i++;
        }
        System.out.println(newList);
    }
}

