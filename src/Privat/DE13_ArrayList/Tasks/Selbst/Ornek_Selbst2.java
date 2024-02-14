package Privat.DE13_ArrayList.Tasks.Selbst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.UnaryOperator;

public class Ornek_Selbst2 {
    public static void main(String[] args) {
        // {1,2,5,4,9,11,2,33,3,2,4} dizideki tekrar eden elemanlari sadece bir kez yazdirin


      ArrayList<String> arrList = new ArrayList<>(Arrays.asList("Almanya", "Türkiye","Italya","Almanya","Italya"));
      ArrayList<String> arrSehir = new ArrayList<>(Arrays.asList("samsun", "rize","istanbul","izmit","singapur"));
/*       System.out.println("arrList.indexOf(Türkiye) = " + arrList.indexOf("Türkiye"));
        System.out.println("arrList.lastindexof(Italya) = " + arrList.lastIndexOf("Italya"));
        if(arrList.isEmpty()) System.out.println("dizi bos");       arrList.clear();        System.out.println(arrList);       arrList=new ArrayList<>();
       System.out.println("arrList = " + arrList);
        arrList.addAll(arrSehir);// adAll herhangi bir Array i digerinin icine atar

       System.out.println("arrList = " + arrList);*/

      arrSehir.replaceAll(e -> arrList.get(arrSehir.indexOf(e)));
      System.out.println("arrSehir = " + arrSehir);
        Collections.sort(arrList);
        System.out.println("arrList = " + arrList);
        Collections.reverse(arrList);
        System.out.println("arrList = " + arrList);


    }
}
