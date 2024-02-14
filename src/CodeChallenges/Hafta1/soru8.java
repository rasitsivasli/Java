package CodeChallenges.Hafta1;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
          /*     Sıcaklığı Fahrenheit'tan Santigrat derecesine çeviren bir
     Java programı yazın. (Scanner class)
          formül
          c = (f-32)*5/9
    ex:
   Input F :120
   Output :48
          */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sicakligi Fahrenheit olarak giriniz : ");

        byte f = scanner.nextByte();

        System.out.println("c = " + (f - 32) * 5 /9.0);
    }
}
