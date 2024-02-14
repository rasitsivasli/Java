package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class _12_array_YineleyenSayiVarMi {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4};
        int[] arr = {1,2,3,1};
        System.out.println("dupicate(arr) = " + dupicate(arr));
    }

    private static boolean dupicate(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);// arr dizisini list metodlarini kullanmak icin list yaptik
        }
        System.out.println("list = " + list);

        boolean sonuc = false;
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);// her elemani önce sildik
            if (list.contains(i)) sonuc = true;// burada da var mi diye tekrar kontrol ettik
        }
        return sonuc;
    }
}