package DE12_Arrays.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task19 {
    public static void main(String[] args) {
        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        //  ve arr2 = { {7,8,9}, {10,11}, {12}, arr1= { {1,2}, {3,4,5}, {6} }}
        // { {1+7,2+8,0+9}
        int[][] dizi = { {1,2}, {3,4,5}, {6} };
        dizi[0] = Arrays.copyOf(dizi[0],3);

        for (int i = 0; i < dizi.length ; i++) {
            System.out.println(Arrays.toString(dizi[i]));
        }

        ArrayList<Integer> dzz = new ArrayList<>();
        List<Integer> dzz2     = new ArrayList<>();


    }
}
