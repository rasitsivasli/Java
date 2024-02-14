package Privat.DE03_03ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*   Bir String oluşturun.
          Konsol'a sevdiğiniz bir meyveyi yazın.
          O meyveyi yazdırınız.   */

        //Kodu aşağıya  yazınız.
        System.out.print("Meyve: ");
        Scanner scan = new Scanner(System.in);
        String meyve=scan.nextLine();
        System.out.println("En sevdigim meyve : "+meyve);

    }
}
