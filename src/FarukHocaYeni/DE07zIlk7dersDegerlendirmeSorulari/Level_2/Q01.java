package FarukHocaYeni.DE07zIlk7dersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /* klavyeden sıra ile  1.sayı, işlem( +, -, *, / ) ve 2. sayı giriliyor ,
        işlemi yapıp ekrana yazdırınız (switch - case kullanılacak
        input
        3
        +
        5
        output 8

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("2 adet sayi giriniz : ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        System.out.println("Bir islem giriniz : ");
        String islem = scanner.next();
        String top =  "+",cik = "",carp = "*",bol = "/";


        switch (islem){

            case "+" :System.out.println(sayi1+sayi2);break;
            case "-" :System.out.println(sayi1-sayi2);break;
            case "*" :System.out.println(sayi1*sayi2);break;
            case "/" :System.out.println(sayi1/sayi2);break;
            default:
                System.out.println("gecersiz giris yaptiniz");
            }



        }


    }

