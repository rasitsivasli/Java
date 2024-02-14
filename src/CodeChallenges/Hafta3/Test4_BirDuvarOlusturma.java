package CodeChallenges.Hafta3;

import java.util.Scanner;

public class Test4_BirDuvarOlusturma {
    public static void main(String[] args) {


        //Kullanıcıdan alınan satır ve sütun sayısına göre duvar örünüz:)
//Karakter []
//Bir tuğlanın maliyeti 27.5 Tl ise duvarın mailiyetini hesaplayınız



        Scanner scanner = new Scanner(System.in);
        System.out.println("Duvarin enini ve boyunnu giriniz : ");
        System.out.print("en : ");
        int en = scanner.nextInt();
        System.out.print("boy : ");
        int boy = scanner.nextByte();

        for (int i = 1; i <=en ; i++) {

            for (int j = 1; j <= boy; j++) {
                System.out.print("[]"+" ");
            }
            System.out.println();
        }
        System.out.println("Maliyet  : "+(en+boy*27.5)+"TL");
    }
}
