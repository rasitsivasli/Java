package CodeChallenges.Hafta7_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) { //    //1.adim str tanimladik

        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min numberı ve dizinin her bir elemanı kaç diziden olştuğunu yazdırın
         */

        Integer[][] arr = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, -12, 3}};
        int enKucuk = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+". dizinin length i = " + arr[i].length);
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]<enKucuk){
                    enKucuk=arr[i][j];
                }
            }
        }
        System.out.println("enKucuk = " + enKucuk);

    }

}

