package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

    /*
    Task-> girilen iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false return eden METHOD create ediniz

    Örnekler:
   ("abc", "bc") ➞ true
   ("abc", "d") ➞ false
   ("samurai", "zi") ➞ false
   ("feminine", "nine") ➞ true
   ("convention", "tio") ➞ false
    */


        Scanner scanner = new Scanner(System.in);
        System.out.print("1. metni giriniz : ");
        String str1 = scanner.nextLine();
        System.out.print("2. metni giriniz : ");
        String str2 = scanner.nextLine();
        System.out.println(esitMi(str1,str2));
    }

    private static boolean esitMi(String str1, String str2) {

      return str1.endsWith(str2);
    }


}
