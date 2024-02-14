package Privat.DE12_Arrays;

import java.util.Arrays;

public class C06_ArraysClass {
    public static void main(String[] args) {
        int[] arr = {4, 6, 33, 44, 11, 5, 7, 8};
        Arrays.fill(arr, 55);//  dizinin tüm elemanlarini istedigimiz gibi degistirir.
        System.out.println("arr = " + Arrays.toString(arr));
        int[] arr2 = {4, 6, 33, 44, 11, 5, 7, 8};

        System.out.println("Arrays.compare(arr,arr2) = " + Arrays.compare(arr, arr2));// birebir esit mi degil mi ona bakiyor. Esit ise 0 esit degilse 1


        arr = Arrays.copyOf(arr,5);// bir diziyi istediginiz eleman sayisina kisaltir
        System.out.println("arr = " + Arrays.toString(arr));
        arr = Arrays.copyOf(arr,10);// bir diziyi istediginiz eleman sayisina arttirir
        System.out.println("arr = " + Arrays.toString(arr));
        arr = Arrays.copyOfRange(arr,3,7);// bir diziyi belirlediginiz elemanlar arasinin keser ve yeni dizi olusur substring gibi
        System.out.println("arr = " + Arrays.toString(arr));
        arr = Arrays.copyOfRange(arr,3,17);// eger araligi index in ötesine tasirsaniz 0 yazar
        System.out.println("arr = " + Arrays.toString(arr));
    }


}
