package Privat.DE06_SwitchCase.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız


        Scanner scan = new Scanner(System.in);
        System.out.print("Pazartesi 1. gün olarak kabul edildiginde haftanin kacinci günündesiniz : ");
        int gununSayisi = scan.nextInt();
        System.out.print("Kac gün sonrasini bilmek istiyorsunu ? : ");
        int kacGünSonra = scan.nextInt();
        int hangiGun = (gununSayisi+kacGünSonra)%7;
        switch (hangiGun) {
            case 1:
                System.out.println("Pzt");
                break;
            case 2:
                System.out.println("Sl");
                break;
            case 3:
                System.out.println("Crs.");
                break;
            case 4:
                System.out.println("Pers.");
                break;
            case 5:
                System.out.println("Cum.");
                break;
            case 6:
                System.out.println("Cmts.");
                break;
            default: // yukarıdakilerin dışındaysa yani else ise
                System.out.println("pazar");

        }


    }
}