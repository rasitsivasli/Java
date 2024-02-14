package Privat.DE08_Loops.L03_DoWhileLoops.Tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri prnt eden code create ediniz

        Scanner scanner = new Scanner(System.in);
        int first;
        int last;
        System.out.print("Baslangic sayisini giriniz: ");
        first = scanner.nextInt();
        System.out.print("Bitis sayisini giriniz: ");
        last = scanner.nextInt();

        do {
            System.out.print(first+",");
            first++;


        }while (first<=last);



    }
}
