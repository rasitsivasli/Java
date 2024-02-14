package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08_OrtalamadanBüyükOlaniYzdirma {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac sayi girmek istersiniz : ");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("EnterNumber : ");
            list.add(scanner.nextInt());
        }
        int toplam = 0;
        for (int i = 0; i < n; i++) {
            toplam += list.get(i);
        }
        double ort = (double) toplam / n;
        for (int i = 0; i < n; i++) {
            if (list.get(i) > ort) newList.add(list.get(i));
        }
        System.out.println("New list = " + newList);


    }


}
