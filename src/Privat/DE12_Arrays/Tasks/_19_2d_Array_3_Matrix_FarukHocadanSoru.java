package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class _19_2d_Array_3_Matrix_FarukHocadanSoru {

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
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( (Arrays.toString(arr[i]).replace("[","{").replace("]","}")+",").replace("k},","k}"));

        }System.out.println("}");

    }
}

