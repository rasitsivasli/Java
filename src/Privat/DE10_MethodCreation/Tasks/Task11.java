package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task11 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /* Task-> girilen ifadeyi 'hacker' dilinde print eden METHOD create ediniz

        a->7
        v->1
        c->-4
        e->2
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Metin giriniz : ");
        String str = scanner.nextLine();

        hackerDilineCevir(str);
        System.out.println(hackerDilineCevir(str));




    }//main sonu

    private static String hackerDilineCevir(String str) {

        String yeniMetin = str.replaceAll("a", "7").replaceAll("v", "1").replaceAll("c", "-4").replaceAll("e", "2");
        return yeniMetin;
    }


}
