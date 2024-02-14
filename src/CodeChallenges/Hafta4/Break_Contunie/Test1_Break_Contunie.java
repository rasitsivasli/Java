package CodeChallenges.Hafta4.Break_Contunie;

public class Test1_Break_Contunie {
    public static void main(String[] args) {
        // 1 den 100 kadar randomdan aldiginiz  tek sayilardan 10 un kati olanlar haric yazdir,
        // eger randomdan cikan sayi 70 ten büyük bir sayi ise code u sonlandir..

        int random;

        while (true) {
            random = (int) (Math.random() * 100 + 1);

            if (random > 70) {
                System.out.println("Random sayisi 70 ten büyüktür");
                break;
            }
            else if (random % 2 == 1 && random % 5 != 0) {

                System.out.print(random + ",");
            }

        }

    }
}
