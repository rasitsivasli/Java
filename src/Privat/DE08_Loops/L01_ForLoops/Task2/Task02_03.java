package Privat.DE08_Loops.L01_ForLoops.Task2;

import java.util.Scanner;

public class Task02_03 {
    public static void main(String[] args) {
        // 1 den n kadar çift sayıların toplamını bulan bir program yazınız

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kacinci sayiya kadar cift sayilarin toplamini bulmak istiyorsunuz  : ");
        int n = scanner.nextInt();
        int toplam = 0 ;

        for (int i = 0; i <= n; i++) {
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println("1 den "+n+". "+"sayiya kadar olan sayilarin toplami : "+toplam);
    }
}
