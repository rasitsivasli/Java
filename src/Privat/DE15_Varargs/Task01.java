package Privat.DE15_Varargs;

public class Task01 {
    public static void main(String[] args) {
        /*
        Task -> verilen Stringleri birlestiren concat isimli METHOD create ediniz.

        input : "h", "a", "l", "u", "k";
        output : haluk

        input : "a", "l", "i";
        output : ali

         */

        String[] strArr1 = {"h", "a", "l", "u", "k"};
        String[] strArr2 = {"a", "l", "i"};

        concat(strArr2, "h", "a", "l", "u", "k");


    }//main sonu

    private static void concat(String[] strArr2, String... harfler) {
        String str2 = "";
        for (String w : strArr2) {
            str2 += w;
        }
        System.out.println("str2 = " + str2);

        String str1 = "";
        for (String w : harfler) {
            str1 += w;
        }
        System.out.println("str1 = " + str1);
    }

}
