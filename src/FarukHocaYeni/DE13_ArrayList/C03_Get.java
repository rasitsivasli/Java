package DE13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_Get {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>
                (Arrays.asList("Ankara","Mersin","Trabzon","İzmir","Samsun"));
        //String[] dizi = new String[10];
        // add, ile veri ekliyoruz
        System.out.println(list);
        String sehir = list.get(0); // ilk elemanı al sehir variable ına aktar // sehir = dizi[0];
        System.out.println(sehir);
        System.out.println(list.getFirst()); // ilk elemanı alıp yazar
        // son elemanı sehir varablına aktaralım
        sehir = list.get(list.size()-1); // sehir = list.getLast(); sehir = dizi[dizi.length-1]

    }

}
