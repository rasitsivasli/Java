package Privat.DE14_ForEachLoops;

public class Varrags_Beispiel {
    public static void main(String[] args) {

      stringeCevirMetodu ("H","a","s","a","n");
    }

    private static void stringeCevirMetodu(String ... harfler) {
        String str = "";
        for (String eleman:harfler) {
            str+=eleman;
        }
        System.out.println("str = " + str);
    }
}
