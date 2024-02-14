package DE03_ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {


        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * MainClass : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */

        System.out.print("Bir Karekter giriniz : ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        System.out.println(ch); // Baba
        System.out.println(ch+0); // 65
        System.out.println((int) ch); // 65





    }


}
