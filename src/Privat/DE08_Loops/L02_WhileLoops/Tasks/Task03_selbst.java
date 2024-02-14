package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task03_selbst {
    public static void main(String[] args) {
        //Task-> girilen tamsayı için çarpım tablosu print eden code create ediniz
        //input: 8-> output :8x1=8, 8x2=16... 8x10=80



        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int num = scanner.nextInt();

        int n=1;

        while (n<=10){
            System.out.println(num+"x"+n+"="+num*n);
            n++;
        }


    }
}
