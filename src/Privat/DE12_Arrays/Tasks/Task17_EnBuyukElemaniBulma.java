package Privat.DE12_Arrays.Tasks;

public class Task17_EnBuyukElemaniBulma {
    public static void main(String[] args) {
        // Task-> sayi arr'deki en buyuk elemanı print eden code create ediniz...

        int[] arr = {25, 2, 32, 4, 5, 6};
        dieGrossteZahl(arr);

    }

    private static void dieGrossteZahl(int[] arr) {
        int enBuyuk = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>enBuyuk) enBuyuk=arr[i];
        }
        System.out.println("enBuyuk = " + enBuyuk);

    }
}
