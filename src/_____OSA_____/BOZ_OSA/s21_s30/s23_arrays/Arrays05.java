package _____OSA_____.BOZ_OSA.s21_s30.s23_arrays;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        int[] random = { 16, -41, 112, 10, -110 };

        int x = 10;
        int y = Arrays.binarySearch(random,x);//binarySearch nir arama oparotörüdür ve dogru calismasi icin önce sayilarin siralanmasi gerekmektedir
        System.out.println(y);
    }
}

    /*
      A.  2
      B.  3
      C.  6
      D.  Sonuc belirlenemez.
      E.  Bir exception olusur
      F.  Kod calismaz.
     */