package Privat.DE07_StringManuplation.tasks;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */
        String str = "clarusway";
        System.out.println(str.replace(str.charAt(str.length()-1), ' '));

        //2. yol--------------

        System.out.println(str.substring(0,str.length()-1));

    }
}
