package _____OSA_____.DE40InterviewQuestions.Day03;

public class Q06_MultipleMethodVarargs {
    /*
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız ( varargs )
 */
    public static void main(String[] args) {
        ortalamaHesapla(6, 4, 3, 5);

    } // varargs


    // varargs kullanımı
    public static void ortalamaHesapla(int... notlar) {
        int toplam = 0;

        for (int not : notlar) {
            toplam += not;
        }

        double ortalama = (double) toplam / notlar.length;
        System.out.println("ortalama = " + ortalama);

    }
}
