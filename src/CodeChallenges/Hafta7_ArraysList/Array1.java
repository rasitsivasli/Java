package CodeChallenges.Hafta7_ArraysList;

import java.util.ArrayList;
import java.util.List;

public class Array1 {
    public static void main(String[] args) { //    //1.adim str tanimladik
        //    String str = "HeySiri";
//
        //    //2.adim HeySiri yi ByeSiri ye donustur
        //    str =str.replace("Hey", "Bye");
        //    System.out.println(str);
//
        //    String arr[] = new String[1];
        //    arr[0] =str;
        //    System.out.println(Arrays.toString(arr));


        String str = "HeySiri";
        List<String> list= new ArrayList<>();
        list.addAll(List.of(str.split("")));

        System.out.println("list = " + list);
        list.set(0, "Cocuk");
        list.set(1, "y");
        list.set(2, "e");
        System.out.println("list = " + list);
        list.remove(",");
        String yeniStr= String.valueOf(list);
        System.out.println("yeniStr = " + yeniStr);






//        System.out.println("list = " + list);
//String yeniStr="";
//        for (int i = 0; i < list.size(); i++) {
//            yeniStr+=list.get(i);
//        }
//        System.out.println("yeniStr = " + yeniStr);

    }
}
