package Privat.DE35_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_filter {
    /*
    Filter:
   Dizimiz veya Collection’?m?z üzerinde bizim belirtece?imiz ko?ullar do?rultusunda
   filtreleme i?lemi yapmam?za yarayan bir yap?d?r.
   Bu i?lem sonras? belirtti?imiz ko?ula uygun olmayan elemanlar bir sonraki a?amada kullan?lamazlar.
   Art?k elimizde filtrelenmi?/süzülmü?/elenmi? bir veri vard?r
    */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList
                (11, 12, 7, 32,7 ,32, 41, 41, 32, 68, 41, 12, 7, 41, 43, 24, 32));
        list = list.stream().filter(p->p>30).filter(p->p<40).toList();


        System.out.println("\n"+list);
    }

}
