package Privat.DE13_ArrayList.DE13_List_Calisma;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList("Istanbul","Edirne","Bolu","Artvin","Ankara"));
        list.set(3,"Kaiserslautern");// verdigimiz index dekini degistiriyor
        System.out.println("list = " + list);
        list.set(list.size()-1,"Mainz");// son indexi degistiriyor
        System.out.println("list.remove(3) = " + list.remove(3));// hangi index i verirsek onu siliyor
        System.out.println("list = " + list);// istedigimiz index i siliyor ve bunu istersek bir Variable atayabiliriz


        String sehir = list.get(0);// elemaninin kopyasini aliyor, eski dizi aynen kaliyor
        System.out.println("sehir = " + sehir);
        String sonSehir = list.get(list.size()-1);
        System.out.println("sonSehir = " + sonSehir);
        String aa = list.getFirst();// ilk terimi atiyor
        System.out.println("MainClass = " + aa);

        list.add("Istanbul");
        list.add("Edirne");
        list.add("Bolu");
        list.add("Artvin");
        System.out.println("list = " + list);
        list.add(2,"Ankara");// istedigimiz index e yerlestiriyor ve digerleri sona gidiyor
        System.out.println("list = " + list);
        list.add(0,"Stuttgart");
        list.addFirst("Berlin");// en basa ekliyor
        list.addLast("Bonn");// en sona ekliyor
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());

    }
}
