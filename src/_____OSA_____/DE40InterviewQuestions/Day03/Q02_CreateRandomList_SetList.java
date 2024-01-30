package _____OSA_____.DE40InterviewQuestions.Day03;

import java.util.ArrayList;

public class Q02_CreateRandomList_SetList {
    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemanının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        randomEkle(list);
        System.out.println("list = " + list);


    }

    private static void randomEkle(ArrayList<Integer> list) {
        boolean ciftSayilar = false;
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 20);
            if (random % 2 == 0) {
                random = 111;
                list.add(random);
                ciftSayilar = true;
            } else list.add(random);
        }if (!ciftSayilar){
            System.out.println("Listede Cift sayi yoktur");
        }
        if (!list.contains(111)) System.out.println("Listede Cift sayi yoktur");// 2. cozum olarak boolean kullandik

    }

}
