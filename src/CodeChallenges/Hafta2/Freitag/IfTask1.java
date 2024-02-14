package CodeChallenges.Hafta2.Freitag;

import java.util.Scanner;

public class IfTask1 {
    public static void main(String[] args) {

        /* Task ->
      Input from user Y,M,N letter
      Print
         OUTPUT : YES ; NO ; MAYBE
      ıf user input another letter
      Print
         OUTPUT : INVALID
     */

        Scanner scanner = new Scanner(System.in);
        String h = scanner.nextLine().toUpperCase();


        switch (h) {
            case "Y" -> System.out.println("YES");
            case "N" -> System.out.println("NO");
            case "M" -> System.out.println("MAYBE");
            default -> System.out.println("invalid");
        }

///////2. lösung

        if (h.equals("Y")){
            System.out.println("YES");
        } else if (h.equals("N")) {
            System.out.println("NO");
        }else if (h.equals("M")){
            System.out.println("NO");
        }else System.out.println("invalid");

    }
}
