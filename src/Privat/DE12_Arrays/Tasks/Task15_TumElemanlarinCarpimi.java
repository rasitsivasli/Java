package Privat.DE12_Arrays.Tasks;

public class Task15_TumElemanlarinCarpimi {
    public static void main(String[] args) {
        //Task-> arr  tum elemalarının çarpımını print eden code create edinz
        int[] carpim = {1, 2, 3, 4, 5, 6};
        arrCarpim(carpim);
    }

    private static void arrCarpim(int[] carpim) {
        int sonuc = 1;
        for (int j : carpim) {
            sonuc *= j;
        }
        System.out.println("sonuc = " + sonuc);
    }
}
