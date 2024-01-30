package Privat.DE35_Lamda;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    /* Rastgele 20 Integer(1 den 100 e kadar) elemandan olu?an bir List yap?n
    a) Bu list in (stream kullanarak) tek basamakl? elemanlar?n? yazd?r?n
    b) Bu list in (stream kullanarak) tek basamakl? elemanlar?n? yazd?r?n (filter içinde motot kullan?n)


     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int sayi = (int) (Math.random() * 100 + 1);
            list.add(sayi);
        }
        System.out.println(list);
        // a)
        list.stream().filter(p->p<10).forEach(p-> System.out.print(p+" "));
        System.out.println();
        list.stream().filter(Task01::rakamlariAL).forEach(p-> System.out.print(p+" "));


    }

    private static boolean rakamlariAL(Integer p) {
        if (p<10) return true;
        else return false;

    }


}
