package Privat.DE12_Arrays.Tasks02;

import java.util.Arrays;

public class T03_IntDegereriRakamlaraGöreSiralama {
    public static void main(String[] args) {
        // Girilen bir int değerlerini rakamlara göre sıralayan kod create ediniz
        int num = 81763134;
        // input : 81763134;
        // output: 11334678
        // stringe cevir
        // stringi,  string dizisine çevir
        // sırala
        // diziyi str ye çevir
        // str yi int e çevir

        String str = ""+num;

        String[] arr = str.split("");
        Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
        String str2 = "";

        for (int i = 0; i < arr.length; i++) {
            str2 += arr[i];

        }
        System.out.println("str2 = " + str2);
             // 2. yol

    }
}
