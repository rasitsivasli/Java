package Privat.DE14_ForEachLoops;

public class Foreach_Beispiel2 {
    public static void main(String[] args) {
        // Task -> array elamanlarının çarpımını print eden code create ediniz...-> with for-each

        int[][] arr = {{2, 3, 1}, {4, 1}, {1, 2, 5, 6, 7}};

        int carpim = 1;
        for (int[] icArray : arr) {
            for (int eleman : icArray) {
                carpim *= eleman;
            }
        }
        System.out.println("carpim = " + carpim);


    }
}
