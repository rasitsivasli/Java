package SerbetCalismalar.Lambda.Wiederholung;

public class Besipiel {
    public static void main(String[] args) {
        F1 lamda = n -> System.out.println(n);
        lamda.method(5);
        F3<Integer> sayininKaresi = p-> (p*p);
        F3<Integer> sayininKupu = p-> (int) Math.pow(p,3);
        F3<String> upperCase = p-> p.toUpperCase();

        System.out.println("sayininKupu.f3(12) = " + sayininKupu.f3(12));
        System.out.println("sayininKaresi.f3(9) = " + sayininKaresi.f3(9));
        System.out.println("upperCase.f3buyukyaz\") = " + upperCase.f3("buyukyaz"));


        // Functional Interface bir interface dir
        // annotanition kullanir (@FunctionalInterface)
        // Tek bir method alir
        // Her türlü method olusturlabilir
        // Functional interface in amaci lamda expressionlari(methodlar) kullanmamaizi saglar
        // Generic Type dedigimizde tüm data türlerini kapsar  (public interface F3 <T>) buradaki T data Type demek

    }
}