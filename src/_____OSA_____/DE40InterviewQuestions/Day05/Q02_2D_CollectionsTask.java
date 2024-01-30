package _____OSA_____.DE40InterviewQuestions.Day05;

import java.util.ArrayList;
import java.util.Arrays;

public class Q02_2D_CollectionsTask {
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList

    // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    // Bu 3 ArrayList'i 2D ArrayList'te saklayın

    public static void main(String[] args) {


        ArrayList<String>  calisanlar =new ArrayList<>(Arrays.asList("Ali","Ahmet"));
        ArrayList<String>  isverenler =new ArrayList<>(Arrays.asList("Ayse","Fatma"));
        ArrayList<String>  sirketler =new ArrayList<>(Arrays.asList("a","b"));
        ArrayList<ArrayList<String>> lists = new ArrayList<>();

        lists.add(calisanlar);
        lists.add(isverenler);
        lists.add(sirketler);
        System.out.println("lists = " + lists);

    }
}
