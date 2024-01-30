package SerbetCalismalar.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ApiForEachUndFilter {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(11, 7, 25, 6, 54, 66, 8, 14, 56));
        System.out.println("list.stream().filter(p -> p % 2 == 0).toString() = " + list.stream().filter(p -> p % 2 == 0).toList());

        list= list.stream().filter(p -> p % 2 == 0).toList();// atama oldugu icin list degisti  (p%2==0) kismi sart yeri wie if

        list.stream().forEach(p-> System.out.print(p+" "));
        Stream<Integer> akis = list.stream().filter(p->p%2==0);
        List<Integer> yeniList = akis.filter(p -> p > 30).toList();
        System.out.println("yeniList = " + yeniList);
    }
}
