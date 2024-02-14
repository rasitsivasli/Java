package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.ArrayList;
import java.util.List;

public class T13_IlkHarfleriBüyükYazma {
    public static void main(String[] args) {
        // Klavyeden girilen bir stringin ilk harifleri büyük gerisi küçük olacak şekilde düzenleyin
        // input  : "jAva ile haYAT güzel"
        // output : "Java İle Hayat Güzel"

        String str = "jAva ile haYAT güzel";
        str=str.toLowerCase();
        List<String> list= new ArrayList<>();
        list= List.of(str.split(" "));
        List<String> newList= new ArrayList<>();
        System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {
        newList.add(list.get(i).substring(0,1).toUpperCase()+list.get(i).substring(1));
        }
        String yeniStr = String.valueOf(newList);
        yeniStr= yeniStr.replace(",","");
        System.out.println("list = " + yeniStr);


    }
}
