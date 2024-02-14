package FarukHocaYeni.DE13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Set {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>
//                (Arrays.asList("Ankara","Mersin","Trabzon","İzmir","Samsun"));
//        //String[] dizi = new String[10];
//        // add, ile veri ekliyoruz
//        System.out.println(list);
//        list.set(2,"Trabzon61");  // dizi[2] = "Trabzon61"; // trabzon teine trabzon61 yazdık
//        System.out.println(list);
//        // son elemanı "ŞUrfa" yapın
//        list.set(list.size()-1,"ŞUrfa" );
//        System.out.println(list);
        Integer[] arr = {2, 10, 3};
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 10, 3));

        //list = Arrays.asList(arr);//Arrays.asList(arr) bu şekilde yeni bir liste oluşturduğumuz zaman listenin elemanlarında değişiklik yapamayız!!
        list.addAll(List.of(arr));
        list.set(0, 3);
        System.out.println(list);// 2,10,3   -- 3,10,3
        list.add(1);
        System.out.println(list);// 3,10,3,1 ---  2,10,3,1
    }
}
