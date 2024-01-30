package _____OSA_____.DE40InterviewQuestions.Day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q003_FibonacciListNumberIkinciCozum {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    0-1-1-2-3-5-8-13-21-34....
    */
/*
        Stream.iterate(new int[]{0, 1}, p->p[0]<sayi, fibonacci -> new int[]{fibonacci[1], fibonacci[0] + fibonacci[1]}) // line 1
            // .forEach(p-> System.out.println(Arrays.toString(p)));   // line 2
            .map(fibonacci -> fibonacci[0])                                     // line 3
            .forEach(p->System.out.print(p+" "));
    */

    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>(Arrays.asList(0,1));

        int n = 10; // Fibonacci dizisinin uzunluğu
        for (int i = 2; i < n; i++) {
            int nextFibonacci = list.get(i - 1) + list.get(i - 2);
            list.add(nextFibonacci);
        }

        System.out.println(list);




    }
}
