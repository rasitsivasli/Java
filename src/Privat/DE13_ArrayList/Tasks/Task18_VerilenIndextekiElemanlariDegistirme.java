package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task18_VerilenIndextekiElemanlariDegistirme {
    public static void main(String[] args) {
        /* Task->  Verilen bir listede, istenen iki index'deki elementlerin yerini
         kalici olarak degistiren bir method create ediniz

         */

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        System.out.println("sayilar = " + sayilar);

        setMethodu(sayilar);


    }

    private static void setMethodu(List<Integer> sayilar) {
        System.out.print("Elemanlarin yerlerini degistirmek istediginiz 2 Index giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int indexBir = scanner.nextInt();
        int indexIki = scanner.nextInt();
        int temp = sayilar.get(indexIki);//
        sayilar.set(indexIki,sayilar.get(indexBir));
        sayilar.set(indexBir,temp);

        System.out.println("sayilar yeni dizisi = " + sayilar);
    }


}
