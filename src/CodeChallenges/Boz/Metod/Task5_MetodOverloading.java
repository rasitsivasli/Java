package CodeChallenges.Boz.Metod;

public class Task5_MetodOverloading {
    public static void main(String[] args) {

        toplam(3, 5);
        toplam(3.5, 5);
        toplam(3.9, 4.6);

    }// java farkli sinnature a sahip olan metodlara izin verir
    // signature : metod ismi+ variabel türü+variabel türü
    // örnek: toplam+int+int bir String gibi düsünün

    public static void toplam(int a, int b) {

        System.out.println("int+int" + a + b);

    }

    public static void toplam(double a, int b) {
        System.out.println("double plus int" + a + b);
    }

    public static void toplam(double a, double b) {
        System.out.println("double plus double" + a + b);
    }
}
