package Privat.DE12_Arrays.Sorular;

import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {

        // Bir 5 elemanli int dizisi olusturun, icerisine elemanlari 3,6,1,3,5 olsun.

               // 1.yol
        int[] intArray = {3, 6, 1, 3, 5};
              // 2.yol
        int[] intArr2 = new int[]{3, 6, 1, 3, 5};
              // 3.yol
        int[] intArr3 = new int[5];

        intArr3[0]=3;
        intArr3[1]=6;
        intArr3[2]=1;
        intArr3[3]=3;
        intArr3[4]=5;



        System.out.println("ilk eleman : "+ intArray[0]+"\nson eleman : "+intArray[intArray.length-1]);


        // baska bir sekilde

        int[] intArr = new int[5];

        for (int i = 0; i < intArr.length; i++) {

            intArr[i] = i;
        }
        System.out.println("intArr = " + Arrays.toString(intArr));
    }
}
