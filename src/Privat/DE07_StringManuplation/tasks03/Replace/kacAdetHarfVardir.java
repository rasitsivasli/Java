package Privat.DE07_StringManuplation.tasks03.Replace;

public class kacAdetHarfVardir {
    public static void main(String[] args) {

        String str = "Rasit Sivasli Samsun";

        String str2 = str.replaceAll("a",""); // tüm a lari siliyoruz
        System.out.println("str2 = " + str2);

        System.out.println(str.length()-str2.length());
    }
}
