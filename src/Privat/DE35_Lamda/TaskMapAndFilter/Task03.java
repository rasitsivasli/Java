package Privat.DE35_Lamda.TaskMapAndFilter;

import java.util.ArrayList;
import java.util.List;

public class Task03 {
    /* Rastgele 20 Integer(1 den 100 e kadar) elemandan olu?an bir List yap?n
  stream yard?m ile
 a) Bu list in tek elemanlar?n?, 2 ile çarp?n, çift elemalar?n? ise 2 ye bölün
 b) ayn?s?n? stream içerisinde metot kullanarak yap?n

   */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            int sayi = (int) (Math.random()*100+1);
            list.add(sayi);
        }

    }
}
