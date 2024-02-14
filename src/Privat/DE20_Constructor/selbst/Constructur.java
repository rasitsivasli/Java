package Privat.DE20_Constructor.selbst;

import java.util.ArrayList;
import java.util.Scanner;

public class Constructur {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Person kisi;
        ArrayList<Person> kisiler = new ArrayList<>();
        String cevap;
        do {
            Person sahis = veriOkuma();
            kisiler.add(sahis);
            System.out.println("Devam mi?");
            cevap = scanner.next().toLowerCase().substring(0,1);
        }while (cevap.equals("e"));
        for (int i = 0; i < kisiler.size(); i++) {
            kisi = new Person();
            kisi = kisiler.get(i);
            System.out.println(kisiler.get(i).isim+" "+kisiler.get(i).sehir+" "+kisiler.get(i).yas);
        }

    }

    private static Person veriOkuma() {
        Person pers = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Isim giriniz : ");
        pers.isim = scanner.next();
        System.out.print("Sehir giriniz : ");
        pers.sehir = scanner.next();
        System.out.print("Yas giriniz : ");
        pers.yas = scanner.nextInt();


        return pers;
    }
}
