package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task09bucuk_KarelerinToplami {
    public static void main(String[] args) {
  /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {// 5 elemanli bir list olusturduk
            System.out.print("liste atamak için sayı giriniz : ");
            int n = scanner.nextInt();
            list.add(n);
        }
        System.out.println("list = " + list);
        for (int i = 0; i < list.size(); i++) {
            toplam += list.get(i) * list.get(i);//
        }

        System.out.println("toplam = " + toplam);
    }
}
