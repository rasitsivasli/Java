package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task14_SoruYok {
    public static void main(String[] args) {


        String str = "Lutfen bir String giriniz";

        List<String>list = new ArrayList<>(List.of(str.split("")));

        Collections.sort(list);
        System.out.println(list);


    }
}
