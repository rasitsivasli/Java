package SerbetCalismalar.Lambda.Wiederholung;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
        // Predicate Functional Interface
        // Bir parametre alir ve boolean deger gonderir

        // Consumer Functional Interface bir parametre alir ve geri donus tipi void

        Predicate<String> kelimeUzunluk3 = p -> p.length() > 3;
        Predicate<String> kelimeEileBasliyorMu = p -> p.startsWith("e");
        String str = "Java";
        System.out.println("kelimeUzunluk3.test(str) = " + kelimeUzunluk3.test(str));

        if (kelimeUzunluk3.test(str)) System.out.println("kelime 3 den uzun");
        else System.out.println("kelime 3 den kisa");

        if (kelimeEileBasliyorMu.test("elvan")) System.out.println("e ile basliyor");
        else System.out.println("e ile baslamiyor");


        Consumer<String> yaz = p -> System.out.println("*"+p);
        Consumer<StringBuilder> tersYaz = p -> System.out.println(p.reverse());

        yaz.accept("kalem");// accept consumer in test methodu gibi. Accept kabul etmek demek
        tersYaz.accept(new StringBuilder("kalem"));
    }
}
