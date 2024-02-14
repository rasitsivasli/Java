package Privat.DE19_StringBuilder.Tasks;

public class Task01 {
    public static void main(String[] args) {
        /*
        Task->
        	Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) METHOD create ediniz.
	     (without case sensitivity)
	     Eg : input : javaCAN'lara selam olsun :)
	     Output: "Reversed sentence : ): nuslo males aral'NACavaj
	        Ogrenci is not a palindrome"
         */

        StringBuilder sb = new StringBuilder("javaCAN'lara selam olsun :)");
        tersSB(sb);


    }//main sonu

    private static void tersSB(StringBuilder sb) {

        String sbString = sb.toString();
        System.out.println("sbString = " + sbString);
        String sbStringReverse = String.valueOf(sb.reverse());
        System.out.println("sbStringReverse = " + sbStringReverse);

        if (sbString.equals(sbStringReverse)) System.out.println("Palindrom dur");
        else System.out.println("Palindrom diildir");
    }


}//class sonu
