package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya  tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */

        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 100 + 1);
        System.out.println("random = " + random);


        int counter = 1;

        while (counter <= 100) {
            System.out.print("Bir sayi tahmin ediniz : ");
            int sayi = scanner.nextInt();

            if (sayi != random) {
                System.out.println("Yanlis tahmin ediniz. "+counter+". Deneme");
                counter++;
            } else {
                System.out.println("Dogru tahmin ettiniz.+" + "\n" + " Deneme sayisi : " + counter);break;
            }

        }


    }
}

