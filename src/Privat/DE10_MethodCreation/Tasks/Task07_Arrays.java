package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task07_Arrays {
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

        int [] sonDurum = {num1, num2, num3};
        int enKucuk= Integer.MAX_VALUE;
        System.out.println("En kucuk sayi " + enKucukSayi(sonDurum, enKucuk));

    }//main sonu

    private static int enKucukSayi(int [] sonDurum,int enKucuk ) {

        for (int i = 0; i < sonDurum.length; i++) {
            if (sonDurum[i]<enKucuk){
                enKucuk=sonDurum[i];
            }
        }
        return enKucuk;
    }


}
