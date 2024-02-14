package CodeChallenges.Hafta6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {

        int[] arr1 = {1, 5, 7, 9};
        int[] arr2 = {1, 5, 7, 9};

        System.out.println(Arrays.equals(arr1, arr2));

        int[] arr3 = {9, 7, 5, 1};
        int[] arr4 = {1, 5, 7, 9};

        Arrays.sort(arr3);
        Arrays.sort(arr4);
        System.out.println(Arrays.equals(arr3,arr4));

    }

}