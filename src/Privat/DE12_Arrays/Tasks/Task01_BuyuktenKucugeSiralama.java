package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class Task01_BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        //Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.

        int[] array = {0, 15, 2, 36, 12, 24, 56, 21};

        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i]+",");

        }

        // 2. yolll

        System.out.println();
        int enBuyuk = array[0];
        for (int i = array.length-1; i >=0; i--) {
            if (array[i]>enBuyuk) {
                enBuyuk=array[i];
                System.out.print(enBuyuk+",");
                enBuyuk=Integer.MIN_VALUE;
            }

        }


    }
}
