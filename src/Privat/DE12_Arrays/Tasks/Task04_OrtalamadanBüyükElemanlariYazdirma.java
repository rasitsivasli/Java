package Privat.DE12_Arrays.Tasks;

public class Task04_OrtalamadanBüyükElemanlariYazdirma {
    public static void main(String[] args) {
        // Task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz

        int[] arr = {3, 5, 12, 6, 52, 0, 14};

        ortalamadanBuyukOlanlar(arr);

    }

    private static void ortalamadanBuyukOlanlar(int[] arr) {
        int toplam = 0;
        double ort = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
            ort= (double) toplam / arr.length;
        }
        System.out.println("ort = " + ort);
        System.out.print("Ortalamadan büyük olan sayilar : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ort) System.out.print( arr[i]+",");

        }
    }


}
