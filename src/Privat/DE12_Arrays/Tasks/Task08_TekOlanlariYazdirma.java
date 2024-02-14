package Privat.DE12_Arrays.Tasks;

public class Task08_TekOlanlariYazdirma {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        int[] arr = {2, 5, 7, 9, 10, 12, 15};
        tekElemanlar(arr);
    }

    private static void tekElemanlar(int[] arr) {
        System.out.print("Dizinin tek elemanlari : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==1){
                System.out.print(arr[i]+",");
            }

        }
    }
}
