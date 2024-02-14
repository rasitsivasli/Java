package Privat.DE13_ArrayList.DE13_List_Calisma;

import java.util.ArrayList;

public class ListSoru {
    public static void main(String[] args) {

        // 20 elemanli Arraylist -10,+10 arasindaki sayilar ile doldurun. eksi sayilar basa artilar sonda 0 lar ortada kalsin

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random()*11-5));

            if (list.get(i)>0){
                list.add(list.size()-1);
            }

        }
        System.out.println("list = " + list);
    }
}
