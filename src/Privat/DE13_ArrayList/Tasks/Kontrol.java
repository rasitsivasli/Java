package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Kontrol {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ ve 'Baba'  harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        Integer [] arr = {1,2,3,4,5,6};
        ArrayList<Integer> isimList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("arr = " + isimList);


    }
}
