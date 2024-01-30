package Privat.DE35_Lamda.TaskMapAndFilter;

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
        /*
        Random rnd = new Random();
        int sayi = rnd.nextInt(1,10);
        */

        System.out.println(list);
        list.stream().filter(p->p%2==1).map(p->p+1).forEach(p-> System.out.print(p+" "));
        System.out.println();
        list.stream().filter(Task02::ciftSil).map(Task02::birEkle).forEach(p-> System.out.print(p+" "));


    }

    private static int birEkle(Integer integer) {
        return integer+1;
    }

    private static boolean ciftSil(Integer integer) {
        return integer%2==1;
    }
}
