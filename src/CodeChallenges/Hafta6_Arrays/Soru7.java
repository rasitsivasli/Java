package CodeChallenges.Hafta6_Arrays;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {

        /* Task->
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        System.out.print("Bir metin giriniz : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count = 0;
        System.out.println("xyzVarMi(str) = " + xyzVarMi(str));
        System.out.println("xyzVarMi(str) = " + xyzVarMi(str, count));

    }
    private static boolean xyzVarMi(String str) {
        boolean durum = false;
        int count = 0;

        if (str.contains("xyz")) {
            durum = true;
        }
        return durum;
    }

    private static int xyzVarMi(String str, int count) {
        count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("xyz")) {

                str = str.replaceFirst("xyz", "");
                count++;
            }
        }
        return count;
    }
}