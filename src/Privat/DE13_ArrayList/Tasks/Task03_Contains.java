package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03_Contains {
    public static void main(String[] args) {

        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.

        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38));
        Scanner sc = new Scanner(System.in);
        System.out.print("agam hangi sayı arirsen :");
        int ara = sc.nextInt();
        System.out.println("varMi(ara,listSayi) = " + varMi(ara, listSayi));


    }

    private static boolean varMi(int ara, ArrayList<Integer> listSayi) {
        if (listSayi.contains(ara)) return true;

        return false;
    }
}
