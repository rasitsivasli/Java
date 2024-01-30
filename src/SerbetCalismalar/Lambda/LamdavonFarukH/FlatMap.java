package SerbetCalismalar.Lambda.LamdavonFarukH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bu bir denemedir");
        list.add("bu dur bir deneme");
        list.add("satir denemedir");
        list.add("bu dosya");
        list.add("dosya bu bir deneme deneme");
        list.stream()
                .map(p->p.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(p-> System.out.print(p+" "));
        System.out.println();
        //Ornek 2

        List<List<String>> listler = new ArrayList<>();

        list = (Arrays.asList("ali", "Ayse"));
    }
}
