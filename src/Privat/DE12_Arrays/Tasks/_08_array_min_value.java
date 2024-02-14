package Privat.DE12_Arrays.Tasks;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..

        int[] arr = {14 , 19 , 5 , 21};
        int enKucuk = Integer.MAX_VALUE;
        enKucukDeger(arr, enKucuk);
    }

    private static void enKucukDeger(int[] arr, int enKucuk) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<enKucuk){
                enKucuk=arr[i];
            }
        }
        System.out.println("enKucuk = " + enKucuk);
    }
}

