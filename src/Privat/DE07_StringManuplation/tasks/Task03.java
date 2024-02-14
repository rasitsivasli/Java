package Privat.DE07_StringManuplation.tasks;

public class Task03 {
    public static void main(String[] args) {
        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini return eden code create ediniz


        String str = "Alamanya";



        System.out.println(str.indexOf('a',str.indexOf(str.length()+1)));






//
//        int ilk_a_Index = str.indexOf('a');//sonuc = 2
//
//        String str2 = str.substring(ilk_a_Index + 1);// str2 = manya
//        int ikinci_a_index = str2.indexOf('a',ilk_a_Index+1);
//
//        System.out.println("ikinci_a_index = " + ikinci_a_index);
//
////        2.yol
//
//        ikinci_a_index = str.indexOf('a',str.indexOf('a')+1);
//        System.out.println("ikinci_a_index = " + ikinci_a_index);


//        int ilk_a_Index = str.indexOf('a');//sonuc = 2
////
//        String str2 = str.substring(ilk_a_Index + 1);// str2 = manya
//        int ikinci_a_index = str2.indexOf('a',ilk_a_Index+1);
//
//        System.out.println("ikinci_a_index = " + ikinci_a_index);
    }
}
