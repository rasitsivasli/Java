package Privat.DE20_Constructor.Tasks.Arac;

import java.util.ArrayList;
import java.util.Scanner;

/*
    field ları , marka,model,yas,km,fiyatı den olucan bir arac clası olustur
    sonra
    bir array liste bu arac class verilerinden cok sayıda ekleyin(en az 10 veri olsun)
    bu veriler , ikinic el arac satan bir galeriye aittir,
    gelen müşteriye istediği özllikleri sorsun ve bu özelliklere göre eldeki araçları listelesin

     */
public class AracMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Arac aracOzellikleri;
        ArrayList<Arac> aracList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            aracOzellikleri = veriAktarma();
            aracList.add(aracOzellikleri);
        }
        System.out.println("aracList = " + aracList);

        System.out.print("Arac markasini giriniz : ");
        String istenenMarka = scanner.next();
        for (int i = 0; i < aracList.size(); i++) {
            if (istenenMarka.equals(aracList.get(i).marka)) System.out.println(aracList.get(i));

        }
    }

    private static Arac veriAktarma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Arac markasini giriniz : ");
        String marka = scanner.next();
        System.out.print("Arac modelini giriniz: ");
        String model = scanner.next();
        System.out.print("Arac yaşıni giriniz : ");
        int yas = scanner.nextInt();
        System.out.print("Arac km sini giriniz : ");
        int km = scanner.nextInt();
        System.out.print("Arac fiyatini giriniz : ");
        int fiyat = scanner.nextInt();
        Arac veriler = new Arac(marka, model, yas, km, fiyat);
        return veriler;
    }


}
