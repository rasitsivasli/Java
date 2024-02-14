package Privat.DE12_Arrays.Tasks;

public class Task10_ElemanlarinIsaretiniDegistirme {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir METHOD create ediniz.
        input :
        output :-1,-2,3,-4,5,6

         */
        int[] arr = {1, 2, -3, 4, -5, -6};

        isaretDesistir(arr);
    }
    private static void isaretDesistir(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] = -1 * arr[i];
            System.out.print(arr[i] + ",");
        }
    }
}
