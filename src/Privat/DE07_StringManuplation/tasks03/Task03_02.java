package Privat.DE07_StringManuplation.tasks03;

import java.util.Scanner;

public class Task03_02 {
    public static void main(String[] args) {
        // Bir tarih string olarak veriliyor , bir sonraki günün tarihini yazdırınız
        // tüm aylar 30 gün olarak düşünün, ( yıl aşımını dikkate almayın 3.kademe)  (
        // input = "20/11/2022" , input 2 : "30/11/2022"
        // output= "21/11/2022" , output 2: "01/12/2022"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tarih giriniz : ");
        String tarih = scanner.nextLine();

        String gun = tarih.substring(0, 2);
        int sonrakiGunInt = Integer.parseInt(gun) + 1;

        String ay = tarih.substring(3, 5);
        int ayInt = Integer.parseInt(ay);

        String yil = tarih.substring(6, 10);
        int yilInt = Integer.parseInt(yil);

        if (sonrakiGunInt < 30) {
            System.out.println(sonrakiGunInt + "/" + ayInt + "/" + yilInt);

        } else if (sonrakiGunInt==30){
            System.out.println("01" + "/" + (1 + ayInt) + "/" + yilInt);

        }else System.out.println("yanlis giris yaptiniz..");
    }


}

