package Privat.DE06_SwitchCase.tasks;

import java.util.Scanner;

public class Task6_2 {

    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Ogretmen) kisaltmasindaki harflerin anlamini print eden code create ediniz
        // bu harflerden(v,i,p) biri girilecek ve çıktı olarak uzun hali(Very, Important, Ogretmen) yazacak
        System.out.print("v,i veya p harflerinden birini giriniz : ");
        Scanner scanner = new Scanner(System.in);
        char harf = scanner.next().toLowerCase().charAt(0);

        switch (harf){
            default:
                System.out.println("Hatali giris yaptiniz");break;
            case 'v':
                System.out.println("Vip");break;
            case 'i' :
                System.out.println("Important");break;
            case 'p':
                System.out.println("Ogretmen");break;
        }
    }
}
