package Privat.DE20_Constructor.selbst;

import java.util.ArrayList;

public class StudentCunstructurYeni {
    public static void main(String[] args) {


        ArrayList<Student> ogrler = new ArrayList<>();
        Student ogrenci = new Student("Ahmet", "Kas", 10, 65, 3555, true);
        ogrler.add(ogrenci);
        System.out.println("ogrenci = " + ogrenci);

        for (int i = 0; i < ogrler.size(); i++) {
            System.out.println(ogrler.get(i));
        }
    }


}
