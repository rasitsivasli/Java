package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class Task20_IstenmeyenElemanlariSilma {
    public static void main(String[] args) {
        // Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz

        int[] arr = {1, 5, 9, 32, 14, 57};
        istenmeyeniSil(arr);// 3 ün kati olan var silen kod

    }

    private static void istenmeyeniSil(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] % 3== 0)) {
                count++;// 3 ün kati olmayan kac adet sayi var bunu bulmak icin...

            }
        }
        System.out.println("count = " + count);

        int[] newArr = new int[count];// 3 un kati olmayanlarin sayisina göre yeni bir dizi olusturuldu
        int index= 0;// yeni dizinin index inin artmasi icin yeni bir int tanimlandi..

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 3!= 0)){
                newArr[index]= arr[i];// yeni olusturulan arr in indexi icin yapildi
                index++;// bir sonraki elemanlar icin index artiyor
            }
        }
        System.out.println("newArr = " + Arrays.toString(newArr));
    }
}
