package Privat.DE12_Arrays.Tasks;

public class _02_Create_array2 {

    public static void main(String[] args) {

    /*          int Array oluşturun.
                elemanları : 13, 15,14,16,16
                Arrayin elemanlarını yazdırın.
     */
        // Kodu aşağıya yazınız..


        int [] arr = {13, 15,14,16,16};
        elemanlariYzdir(arr);
    }

    private static void elemanlariYzdir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}


