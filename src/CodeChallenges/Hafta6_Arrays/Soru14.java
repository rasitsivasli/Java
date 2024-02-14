package CodeChallenges.Hafta6_Arrays;

public class Soru14 {

    /*
   Create a function that takes an array and the difference between the largest
   and the smallest numbers.
   Ask user to enter array elements.
   Girilen  bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını return eden  method create ediniz.
*/
    public static void main(String[] args) {
        int[] arr = {1, 15, 32, 12, 65, 0};

        System.out.println("fark(arr) = " + fark(arr));
    }

    private static int fark(int[] arr) {

        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > enBuyuk) enBuyuk = arr[i];
            if (arr[i] < enKucuk) enKucuk = arr[i];
        }

        return (enBuyuk - enKucuk);
    }

}

