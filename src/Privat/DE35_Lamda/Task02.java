package Privat.DE35_Lamda;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    /* Rastgele 20 Integer(1 den 100 e kadar) elemandan olu?an bir List yap?n
    stream yard?m ile
   a) Bu list in tek elemanlar?na, 1 ekleyin, çift elemalar?n? ise kald?r?n (silin)
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
