package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T03_OrtancaSayiyiBul {
    public static void main(String[] args) {
        // rastgele birbirinden farkli 3 int sayı klavyeden girin ve ortancasını sadece bir adet if değimi
        // kullanarak bulun. ( Ternary,Math,Integer kullanılmayacak)

        int num1 = 7;
        int num2 = 2;
        int num3 = 9;

        ortancaSayiyiBul(num1, num2, num3);
        ifIleortancaSayiyiBul(num1, num2, num3);

    }

    private static void ifIleortancaSayiyiBul(int num1, int num2, int num3) {
        if (num1 > num2 && num1 < num3) System.out.println("Ortanca sayi : " + num1);
        else if (num2 > num1 && num2 < num3) System.out.println("Ortanca sayi : " + num2);
        else System.out.println("Ortanca sayi : " + num3);


    }

    private static void ortancaSayiyiBul(int num1, int num2, int num3) {

        List<Integer> list = new ArrayList<>(Arrays.asList(num1, num2, num3));
        Collections.sort(list);
        System.out.println(list.get(list.size() / 2));
    }
}
