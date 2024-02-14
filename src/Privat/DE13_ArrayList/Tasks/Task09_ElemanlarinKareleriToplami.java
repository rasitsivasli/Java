package Privat.DE13_ArrayList.Tasks;

import java.util.*;

public class Task09_ElemanlarinKareleriToplami {
    public static void main(String[] args) {
  /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        Scanner scanner = new Scanner(System.in);


        int toplam = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {// q alincaya kadar tekrarlamasi icin
            System.out.print("liste atamak için sayı giriniz\nAgam yeter diyirsen 'q' gir : ");
            String n = scanner.next();
            if (n.equalsIgnoreCase("q")) break;// n String oldugu icin
            list.add(n);
        }
        System.out.println("list = " + list);
        for (int i = 0; i < list.size(); i++) {
            toplam += Integer.parseInt(list.get(i))*Integer.parseInt(list.get(i));// Sayilar String old. icin cevirdik
        }

        System.out.println("toplam = " + toplam);


    }
}
