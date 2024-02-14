package Privat.DE12_Arrays.Tasks02;

import java.util.Arrays;

public class T02_SortKullanmadanSiralama_SOR {
    public static void main(String[] args) {
        int[] arr = {21, 27, 46, 79, 44, 2, 1, 80};
        // Arrays.sort kullanmadan diziyi sıralayınız
        // selection sort , seçmli sıralama
        // int[] arr3 = {21, 27, 46, 79, 44, 2, 1, 80};
        // int[] arr3 = {1, 27, 46, 79, 44, 2, 21, 80};
        // int[] arr3 = {1, 2, 46, 79, 44, 27, 21, 80};
        // int[] arr3 = {1, 2, 21, 27, 44, 79, 46, 80};
        // int[] arr3 = {1, 2, 21, 27, 44, 79, 46, 80};
        // int[] arr3 = {1, 2, 21, 27, 44, 46, 79, 80};
        for (int i = 0; i < arr.length; i++) {// islemi uzunluk sayisinca yapar
            for (int j = 0; i < arr.length - 1 - j; j++) {// burada 1 defa yapar bir sonrakini eger büyükse bir öne alir
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }System.out.println("arr = " + Arrays.toString(arr));


        // 2.sıralama yöntemi (buble sort, kabarcık sıralama
        // {21, 27, 46, 79, 44, 2, 1, 80};
        // {21, 27, 46, 44, 2, 1, 79, 80};
        //


    }


}
