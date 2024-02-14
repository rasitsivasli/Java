package Privat.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
// Task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("Bir sayı daha giriniz : ");
        int sayi2 = input.nextInt();

        for (int i = sayi1; i <sayi2 ; i++) {

            if (i%2==0){
                System.out.print(i+",");
            }
        }





    }
}
