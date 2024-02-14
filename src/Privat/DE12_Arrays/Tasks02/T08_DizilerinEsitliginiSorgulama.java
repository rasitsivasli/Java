package Privat.DE12_Arrays.Tasks02;

import java.util.Arrays;

public class T08_DizilerinEsitliginiSorgulama {
    // 2 dizi var, compare kullanarak ,
    // diziler eşit ise true değilse false dönderen bir method yazınız
    public static void main(String[] args) {

        int[] arr = {21, 27, 46};
        int[] arr2 = {21, 27, 46};


        if (dizilerEsitMi(arr, arr2)==0){
            System.out.println("Diziler esittir");
        }else {
            System.out.println("Diziler esit degildir..");
        }


    }
    private static int dizilerEsitMi(int[] arr, int[] arr2) {

        return Arrays.compare(arr,arr2);
    }




}
