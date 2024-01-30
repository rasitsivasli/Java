package Privat.DE35_Lamda.TaskMapAndFilter;

import java.util.ArrayList;
import java.util.List;

public class Task04 {
    /* Rastgele 20 Integer(1 den 100 e kadar) elemandan olu?an bir List yap?n
    Bu list i ayn? stream içerisinde yan yana yazd?r?n,
    sonra yine bunlar?n yan?na, list in toplam?n? yazd?r?n
    Tüm bunlar ayn? stream içerisinde olmal?.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            int sayi = (int) (Math.random()*100+1);
            list.add(sayi);
        }
        System.out.println(list);
        System.out.println(list.stream().mapToInt(Task04::yazdir).sum());
        // veya alta yazs?n diye
        System.out.println();
        int toplam = list.stream().mapToInt(Task04::yazdir).sum();
        System.out.println("\n"+toplam);


    }

    private static int yazdir(int p) {
        System.out.print(p+" ");
        return p;
    }
}
