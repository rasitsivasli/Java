package CodeChallenges.Hafta4.Break_Contunie;

public class Test2_Break {
    public static void main(String[] args) {
        // Rastgele 1 ile 100 arasinda 50 sayisini bulana kadar sayilar üretiniz. Kac sayi ürettikten sonra 50 sayisi bulunmustur

        int count = 1;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int sayi= (int) (Math.random()*100);
            if (sayi==50)break;
            else count++;

        }
        System.out.println(count);
    }
}
