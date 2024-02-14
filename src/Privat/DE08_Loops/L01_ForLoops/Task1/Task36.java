package Privat.DE08_Loops.L01_ForLoops.Task1;

import java.util.Scanner;

public class Task36 {

    public static void main(String[] args) {
	//  Java ile girilen sayının harmonik serisini bulan program yazacağız.
    //  harmoni seri  = 1 + 1/2 + 1/3 + 1/4 + ...
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("n sayısını giriniz : ");
        n=scan.nextInt();

        System.out.print("1 + ");

        for (int i = 2; i <= n; i++) {

            String  sayi = "1/"+i;

            System.out.print(sayi+" + ");

        }



    }
}
