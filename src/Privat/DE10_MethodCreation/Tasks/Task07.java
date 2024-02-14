package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task07 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz : ");
        int num1 = input.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        int num2 = input.nextInt();
        System.out.print("3. sayiyi giriniz : ");
        int num3 = input.nextInt();

        int sonDurum = enKucukSayi(num1, num2, num3);
        System.out.println("enKucukSayi = " + sonDurum);


    }//main sonu

    private static int enKucukSayi(int num1, int num2, int num3) {

        int enKucuk = num1;

        if (num2 < enKucuk) {
            enKucuk = num2;
        }
        if (num3 < enKucuk) {
            enKucuk = num3;
        }
        return enKucuk;
    }


}
