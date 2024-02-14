package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;
import java.util.SortedMap;

public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan.nextLine();
        System.out.println(text.contains(" "));


        String str2 = text.replace("a","");// kac tane a yada herhangi bir harf vardir

        System.out.println(str2);


            // 3.yol

if (text.indexOf(" ")>=0) System.out.println("bosluk vardir");
else System.out.println("bosluk yoktur");//sonuc -1 olarak kabul ediliyor. genel kabul böyle text.indexOf<0 de diyebilirdik

    }
}

