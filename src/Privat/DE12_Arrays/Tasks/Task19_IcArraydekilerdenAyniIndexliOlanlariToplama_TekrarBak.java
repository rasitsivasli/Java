package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class Task19_IcArraydekilerdenAyniIndexliOlanlariToplama_TekrarBak {
    public static void main(String[] args) {
        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        int disIndex = Math.max(arr1.length, arr2.length);// dis index i bulmak icin yapildi
        int enBuyukIcIndex;// en büyük ic index i bulmak icin yapildi
        int[][] newArr = new int[arr1.length][0];// Bos birakamayiz, yoksa dizi olusmuyor

        for (int i = 0; i < disIndex; i++) {
            enBuyukIcIndex = Math.max(arr1[i].length, arr2[i].length);
            newArr[i] = new int[enBuyukIcIndex];// icerdeki elemanlarin index sayilari olusuyor
        }

        System.out.println("newArr = " + Arrays.deepToString(newArr)); // [[0, 0, 0], [0, 0, 0], [0]]

        for (int i = 0; i < arr1.length; i++) {// 1. array i ana Array in icine yaiyoruz
            for (int j = 0; j < arr1[i].length; j++) {
                newArr[i][j] += arr1[i][j];
            }
            for (int j = 0; j < arr2[i].length; j++) {// 2. arrayi ana array a toplayarak ekliyoruz
                newArr[i][j] += arr2[i][j];
            }
        }
        System.out.println("newArr = " + Arrays.deepToString(newArr));
    }


}

