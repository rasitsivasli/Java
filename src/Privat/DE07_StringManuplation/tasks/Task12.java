package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.Cocuk.J.  şeklinde print eden code create ediniz.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adinizi soyadinizi ve memleketinizi giriniz : ");
        String str = scanner.nextLine();
//        int birinciBosluk = str.indexOf(" ");
//
//        System.out.print(str.charAt(0)+".");
//        System.out.print(str.substring(birinciBosluk+1,birinciBosluk+2)+".");
//        String ikinciParca = str.substring(birinciBosluk+1);
//
//        int ikinciBosluk = ikinciParca.indexOf(" ");
//        System.out.println(ikinciParca.substring(ikinciBosluk+1,ikinciBosluk+2)+".");

//        2. yol----------

        int i1 = str.indexOf(" ");
        int i2 = str.lastIndexOf(" ");// en son boslugu bulur

        System.out.print(str.substring(0,1).toUpperCase()+".");// DEVAM EDERSEN IYI OLUR
        System.out.print(str.substring(i1+1,i1+2).toUpperCase()+".");// DEVAM EDERSEN IYI OLUR
        System.out.println(str.substring(i2+1,i2+2).toUpperCase()+".");// DEVAM EDERSEN IYI OLUR


    }
}
