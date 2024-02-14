package Privat.DE07_StringManuplation.tasks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if (str.contains("R")) System.out.print("R");
        if (str.contains("Baba")) System.out.print("Baba");
        if (str.contains("S")) System.out.print("S");
        if (str.contains("I")) System.out.print("I");
        if (str.contains("T")) System.out.println("T");
//...........................2. yol
        System.out.println(""+str.charAt(17)+str.charAt(0));

    }
}
