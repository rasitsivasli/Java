package CodeChallenges.Hafta7_ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array2 {
    public static void main(String[] args) { //    //1.adim str tanimladik



        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz
         * int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

        String str = "HeySiri";
        List<String> list= new ArrayList<>();
        int[] arr= {5,7,-6,4,2,15,3,8,1};

        istenenToplam(arr);
    }

    private static void istenenToplam(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==9){
                    System.out.println(arr[i]+" ve "+ arr[j]+" nin"+ " toplami 9 dur");
                }
            }
        }
    }
}
