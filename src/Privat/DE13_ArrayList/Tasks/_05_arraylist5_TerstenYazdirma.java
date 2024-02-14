package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _05_arraylist5_TerstenYazdirma {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("New jersey", "New york", "Atlanta", "Florida", "Ohio"));

        System.out.println("rotateList(arrayList) = " + rotateList(arrayList));//[Ohio, Florida, Atlanta, New york, New jersey]
        System.out.println("ikinciYol(arrayList) = " + ikinciYol(arrayList)); //[Ohio, Florida, Atlanta, New york, New jersey]
    }

    private static ArrayList<String> ikinciYol(ArrayList<String> arrayList) {
        Collections.reverse(arrayList);
        return arrayList;
    }

    private static ArrayList<String> rotateList(ArrayList<String> arrayList) {
        String temp;
        for (int i = 0; i < arrayList.size()/2; i++) {
            temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(arrayList.size() - 1 - i));
            arrayList.set(arrayList.size() - 1 - i,temp);
        }
        return arrayList;
    }
}




