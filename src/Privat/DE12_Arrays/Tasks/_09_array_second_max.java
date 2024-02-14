package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..

        int[] arr = {12, 2, 5, 15, 8};

        Arrays.sort(arr);// sort methodu sayilari kücükten büyüge siralar..

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("En büyük 2. deger " + arr[arr.length-2]);

    }
}
