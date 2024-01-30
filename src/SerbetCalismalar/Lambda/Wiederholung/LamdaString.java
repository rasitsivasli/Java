package SerbetCalismalar.Lambda.Wiederholung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// S1: ilk harfi d ve ya c olanlari listeleyelim
// S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
//S3: alfabetik  olarak siralayalim list olarak ***sorted()
//S4: tum 'l' leri silelim yazdiralim ***map(replaceAll)
//S5 : icinde e olanlardan yeni bir list olusturunuz  *** filter(contains())  collect()
// S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
//     ***map(t-< t.substring(0,1) + t-< t.substring(0,1) + t) forEach()
// S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz  *** map substring upperCase- lowerCase
// S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz  ***filter length !=  collect  2.yol skip olabilir

public class LamdaString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");

        list.stream().map(p-> "*"+p+"*").forEach(System.out::println);// soru 2
        System.out.println("Aski code larina göre siraliyor = " + list.stream().sorted().toList());// soru 3

        list.stream().map(p-> p.replace("l","")).forEach(p-> System.out.println(p+" "));// soru 4
            System.out.println("Icinde e olamlardan liste = " + list.stream().filter(p -> p.contains("e")).toList());

        System.out.println("Ilk harfi ilk kez tekrar etmis hali = " +
                list.stream().map(p -> p.substring(0, 1).repeat(2) + p).toList());

        System.out.println("Ilk harf Buyuk digerleri kucuk= " +
                list.stream().map(p -> p.substring(0, 1).toUpperCase() + p.substring(1).toLowerCase()).toList());


        list.stream().filter(p -> p.length()!=4 && p.length() != 6).toList().forEach(p-> System.out.print(p+" "));

        Integer [] arr = {1,2,3};
        System.out.println("\nArray listeye donustu = " + Arrays.asList(arr));
        List<Integer> listArray =  Arrays.asList(arr);
        System.out.println("listArray = " + listArray);
        System.out.println();
        //Arrays.stream(arr) bize array i stream cevirir
        System.out.println("Toplam = " + Arrays.stream(arr).reduce(0, Integer::sum));

    }


}

