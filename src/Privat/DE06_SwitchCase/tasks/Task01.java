package Privat.DE06_SwitchCase.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının
        // harf karakteri ile  print eden code create ediniz.
        //  176  onlar basamağı nasıl bulunuz ?
        // önce 10 bölüerim int bölme olduğundan elimde 17 kalır ben 7 ye ulaşmak istiyorum
        // sonra çıkan sonucu %10 yaptığımda 10 bölümden kalanı yani son rakamı verir 7 yi

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int onlarB = (sayi/10)%10;

        boolean deger = sayi<10;
        if (deger){
            System.out.println("Lütfen en az 2 bas. bir sayi giriniz..");
        }else{
            switch (onlarB){
                case 1 : System.out.println("Onlar basamagi bir"); break;
                case 2 : System.out.println("Onlar basamagi iki"); break;
                case 3 : System.out.println("Onlar basamagi üç"); break;
                case 4 : System.out.println("Onlar basamagi Dört"); break;
                case 5 : System.out.println("Onlar basamagi beş");break;
                case 6 : System.out.println("Onlar basamagi Altı");break;
                case 7 : System.out.println("Onlar basamagi yedi"); break;
                case 8 : System.out.println("Onlar basamagi Sekiz"); break;
                case 9 : System.out.println("Onlar basamagi Dokuz"); break;
                case 0 : System.out.println("Onlar basamagi Sıfır"); break;


            }
        }




        }


    }

