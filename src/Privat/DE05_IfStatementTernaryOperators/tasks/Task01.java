package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
         Task->
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
        0 - 4 => bebek
        5 - 12 => cocuk
        13 - 20 => genc
        21 - 30 => yetiskin
        Tanimlanmamis evre
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Yas giriniz : ");

        int yas = scan.nextInt();

        if (yas <= 4) System.out.println("bebek");
        else if (yas <= 12) System.out.println("cocuk");
        else if (yas <= 20) System.out.println("genc");
        else if (yas <= 30) System.out.println("yetiskin");
        else System.out.print("Lütfen 0 dan 30 kadar bir yas giriniz ");





    }



}







