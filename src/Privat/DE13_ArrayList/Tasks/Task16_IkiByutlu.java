package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task16_IkiByutlu {

    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */

    public static void main(String[] args) {

        List<String> calisanlar = new ArrayList<>(Arrays.asList("ali","veli","sakir"));
        List<String> isverenler = new ArrayList<>(Arrays.asList("sakip","vehbi"));
        List<String> sirketler = new ArrayList<>(Arrays.asList("sabanci","koc"));
        List<List<String>>  diziler = new ArrayList<>();

        diziler.add(calisanlar);
        diziler.add(isverenler);
        diziler.add(sirketler);
        System.out.println("diziler = " + diziler);


    }
}
