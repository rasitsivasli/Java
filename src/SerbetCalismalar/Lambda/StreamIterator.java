package SerbetCalismalar.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIterator {
    public static void main(String[] args) {
        // IntStream.iterate(5,t->t*2+1).limit(10).forEach(p-> System.out.print(p+" "));

        List<Integer> list = new ArrayList<>();

        list = Stream.generate(Math::random)
                .limit(20)
                .map(p -> (int) Math.round(p * 20))
                .toList();
        System.out.println(list);
        System.out.println();

        System.out.println(IntStream.range(1, 11).sum());// 1 den 10 kadar sayilarin toplami
        System.out.println(IntStream.rangeClosed(1, 11).sum());// 1 den 11 kadar sayilarin toplami

        System.out.println("\n------------------");
        List<String> listYeni = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");
        listYeni.stream().filter(p->!p.endsWith("y")).forEach(p-> System.out.println(p+" "));

    }
}
