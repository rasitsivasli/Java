package Privat.DE35_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_map {
    /*
   Map :Stream içerisinde eri?ilen her bir eleman üzerinde i?lem yapmam?za
   ve ba?ka elemanlara dönü?türmemize imkan sa?layan
   findFirst / Last / sum
    */
    // API = Application Programming Interface,
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList
                (11, 12, 7, 32,7 ,32, 41, 41, 32, 68, 41, 12, 7, 41, 43, 24, 32));
  //      System.out.println(list);

        list.stream().map(p->p%2==0? p+" çifttir":p+" tektir").forEach(System.out::print);
        System.out.println();
        list.stream().map(p->ciftTek(p)).forEach(System.out::print);
        System.out.println();
        list.stream().map(C03_map::ciftTek).forEach(System.out::print);
   //     list = list.stream().map(p->p+5).toList();

      //  System.out.println(list);
    }
    public static String ciftTek(int p){
        return p%2==0? p+" çifttir":p+" tektir";
    }
}
