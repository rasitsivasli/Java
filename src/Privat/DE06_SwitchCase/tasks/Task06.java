package Privat.DE06_SwitchCase.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Ogretmen) kisaltmasindaki harflerin anlamini print eden code create ediniz
        // bu harflerden(v,i,p) biri girilecek ve çıktı olarak uzun hali(Very, Important, Ogretmen) yazacak
        System.out.print("v,i veya p harflerinden birini giriniz : ");
        Scanner scanner = new Scanner(System.in);
        char harf = scanner.next().charAt(0);

        if (harf == 'v') {
            System.out.println("Anlami : Very");
        } else if (harf == 'i') {
            System.out.println("Anlami : Important");
        } else if (harf == 'p') {
            System.out.println("Anlami : Ogretmen");
        } else {
            System.out.println("Hatali harf girdiniz");
        }


    }
}
