package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task08_2yol {

    public static void main(String[] args) {

    /*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

   input: 2023
   output:false

   Yılın 4 ile tam bölünebilen yıllar (örneğin, 2020, 2024, 2028) artık yıldır.
   Ancak, 100 ile tam bölünebilen yıllar artık yıl değildir,
   ancak 400 ile tam bölünebilen yıllar tekrar artık yıldır
   (örneğin, 1900 artık yıl değilken, 2000 artık yıldır).

    */
        System.out.println("artikYil() = " + artikYil());
    }
    private static boolean artikYil() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yil giriniz : ");
        int year = scanner.nextInt();
        boolean artikYil = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            artikYil = true;

        } else {
            artikYil = false;
        }
        return artikYil;
    }


}
