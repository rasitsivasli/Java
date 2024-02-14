package Privat.DE12_Arrays.Tasks;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.

        int[] arr = {12, 14, 21, 23, 10, 4};


        double ortalama = ortalama(arr);

        System.out.println("ortalama = " + ortalama);
    }

    private static double ortalama(int[] arr) {
        double toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        return toplam / arr.length;
    }
}