package Privat.DE12_Arrays.Tasks;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

    /*  int dizi[] = {12,2,5,15,8};
        Arrays.sort(dizi);
        System.out.HuseyinBYCalısma.println(dizi[dizi.length-1]);
     */
        // code start here

        int[] arr = {12, 2, 5, 15, 8};
        int enBuyuk = Integer.MIN_VALUE;
        enBuyukDeger(arr, enBuyuk);
    }

    private static void enBuyukDeger(int[] arr, int enBuyuk) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>enBuyuk){
                enBuyuk=arr[i];
            }
        }
        System.out.println("enBuyuk = " + enBuyuk);

    }

}
