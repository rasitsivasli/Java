package Privat.DE13_ArrayList.DE13_List_Calisma;

import java.util.ArrayList;
import java.util.Arrays;

public class List1 {
    public static void main(String[] args) {

      ArrayList <String> arrList = new ArrayList<>(Arrays.asList("rasit","nasil","gidiyor"));
        System.out.println("arrList = " + arrList);
        arrList.add("Iyidir");
        System.out.println("arrList = " + arrList);
        arrList.set(2,"ben kemal");
        System.out.println("arrList = " + arrList);
        arrList.remove(0);
        System.out.println("arrList = " + arrList);
        System.out.println("arrList.get(0) = " + arrList.get(0));
        System.out.println("arrList.getFirst() = " + arrList.getFirst());
        arrList.add(arrList.getLast());
        System.out.println("arrList = " + arrList);
        arrList.add(0, arrList.get(3));
        System.out.println("arrList = " + arrList);


    }
}
