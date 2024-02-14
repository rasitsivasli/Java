package Privat.DE13_ArrayList.Tasks.Selbst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ornek_Selbst3 {



        public static void main(String[] args) {
            // İlk ArrayList
            ArrayList<String> arrayList1 = new ArrayList<>();
            arrayList1.add("Baba");
            arrayList1.add("Cocuk");
            arrayList1.add("C");

            // İkinci ArrayList
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList2.add("X");
            arrayList2.add("Y");
            arrayList2.add("Z");

            // İlk ArrayList'in tüm elemanlarını ikinci ArrayList'in elemanlarıyla değiştirme
            arrayList1.replaceAll(e -> arrayList2.get(arrayList1.indexOf(e)));

            // Değiştirilmiş ArrayList'i yazdırma
            System.out.println("Değiştirilmiş ArrayList: " + arrayList1);

            List<String> list =  new ArrayList<>();
            String [] newArr = new String[2];
            System.out.println("list.toArray(newArr) = " + Arrays.toString(list.toArray()));


        }
    }





