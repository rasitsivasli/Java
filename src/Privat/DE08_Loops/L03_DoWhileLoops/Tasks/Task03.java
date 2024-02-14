package Privat.DE08_Loops.L03_DoWhileLoops.Tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) { /*
    Task-> Girilen bir pozitif tamsayının tam kare olmasını kontrol eden code create ediniz.

     MainClass :  input : 16, output: 4 */


        int n;// girilecek sayi
        double nKarekok;// girilen sayinin karekökü
        boolean flag = false;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayi giriniz: ");
            n = scanner.nextInt();
            nKarekok = Math.sqrt(n);
            System.out.println("nKarekok = " + nKarekok);

        } while (flag);

        if (nKarekok*nKarekok==n){//
            System.out.println("Girilen sayi tamkaredir : " + (int)nKarekok + " nin karesidir..");
        }else {
            System.out.println("Girilen sayi tamkare degildir ");
        }





    }
}
