package CodeChallenges.Hafta8;

public class Soru2 {
    public static void main(String[] args) {
        //Basamaklarının küpleri toplamı kendisine eşit olan sayılara Armstrong sayı denir . ...
        // 407 için = (4*4*4)+(7*7*7)=470 Bu yüzden 407 armstrong bir sayıdır.
        // Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
        // 1'den 500'e kadar olan amstrong sayıları bulunu//465
        double toplam = 0;
        for (int i = 0; i < 500; i++) {
            toplam =  Math.pow(i %10, 3) + Math.pow(((i % 100)/10), 3) + Math.pow(i / 100, 3);
            if (toplam == i) System.out.println(i);
        }
    }
}
