package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task-> istenilen kadar tamsayının toplamını print eden code create ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfenin toplamlarini görmek istediginiz tamsayilarini giriniz: ");
        int n = scanner.nextInt();
        int total = 0;
        int count = 1;


        while (count<=n) {
            System.out.print(count+". Sayi : ");
            int num = scanner.nextInt();
            total += num;

            count++;

        }System.out.print("Toplam : "+total);

    }

}
