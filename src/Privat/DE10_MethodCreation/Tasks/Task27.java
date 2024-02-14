package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task27 {
    /*
   Task->
   belirli bir yukseklikten bırakılan top atildigi yuksekligin 3/4 u kadar yerden yukari dogru ziplamaktadir
    Topun ziplama  yuksekligi 1 metrenin altina dşütüğü ana kadar topun aldigi toplam yolu ve yere vurma sayisini print eden METHOD  create ediniz.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplu biraktiginiz yüksekligi giriniz : ");
        double yukseklik = scanner.nextDouble();

        hesaplama(yukseklik);
    }

    private static void hesaplama(double yukseklik) {
        double yol = 0;
        int counter = 0;
        for (double i = yukseklik; i >= 1; i = i * 3 / 4) {         // i herseferinde 3/4 katina gelecek..
            yol += i + i * 3 / 4;                                   // toplam yola her seferinde güncel yüksekligi ve
                                                                    // carpttiktan sonraki yüksekligi ekliyor.
            counter++;
        }
        System.out.println("Yere vurma sayisi : " + counter);
        System.out.println("Toplam alinan yol : " + yol);


    }
}
