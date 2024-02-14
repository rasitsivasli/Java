package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class _20_Arrayboth_Ends {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..

        int[] array = {1, 2, 3, 4};

        System.out.println("yeniArray(array) = " + Arrays.toString(yeniArray(array)));
    }

    private static int[] yeniArray(int[] array) {

        int[] array2 = new int[2];
        array2[0] = array[0];
        array2[1] = array[array.length - 1];
        return array2;
    }
}