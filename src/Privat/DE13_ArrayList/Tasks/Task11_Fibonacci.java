package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
    /* Task->
    Girilen bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    0-1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz : ");
        int sayi = scan.nextInt();

        List<Integer> list = new ArrayList<>(sayi);
        list.add(0);
        list.add(1);
        for (int i = 2; true; i++) {
            if (list.get(i-1) > sayi) break;
            list.add(i, list.get(i - 1) + list.get(i - 2));

        }
        System.out.println("list = " + list.subList(0,list.size()-1));
    }
}
