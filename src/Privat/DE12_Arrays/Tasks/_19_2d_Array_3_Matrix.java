package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Objects;

public class _19_2d_Array_3_Matrix {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

        String[][] arr = {{"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals("ohio")) arr[i][j] = "Florida";
            }
        }
        System.out.println("arr = " + Arrays.deepToString(arr));
    }
}

