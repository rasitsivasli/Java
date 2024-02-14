package Privat.DE14_ForEachLoops.Tasks;

public class Task04 {
    public static void main(String[] args) {
        // aşağıdakı dizinin tüm elemanlarının ortalamasını hesaplayınız (for-each kullanılacak
        int[][] arr = {{2, 3, 1}, {4, 1}, {1, 2, 5, 6, 7}};
        int toplam = 0;
        int count = 0;
        for (int[] icArray : arr) {
            for (int sayi : icArray) {
                toplam += sayi;
                count++;
            }
        }
        System.out.println("Ortalama : "+ toplam*1.0/count);
    }
}
