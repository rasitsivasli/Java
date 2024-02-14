package CodeChallenges.Hafta4.Break_Contunie;

public class Contunie {
    public static void main(String[] args) {
// rastgele üretilen 1 den 100 e kadar 7 e tam bölünen sayilari yazdirin

        for (int i = 0; i < 100; i++) {
            int sayi = (int) (Math.random()*100);
            if (sayi%7!=0) continue;
            System.out.print(sayi+" ");
        }
    }
}
