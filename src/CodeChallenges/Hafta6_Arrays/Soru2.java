package CodeChallenges.Hafta6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        char[] arr = new char[26];
        char ch = 'Z';
        for (int i = 0; i < arr.length; i++, ch--) {
            arr[i] = ch;
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }

}
