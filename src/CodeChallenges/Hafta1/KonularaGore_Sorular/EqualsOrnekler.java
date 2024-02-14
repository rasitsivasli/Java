package CodeChallenges.Hafta1.KonularaGore_Sorular;

public class EqualsOrnekler {
    public static void main(String[] args) {
        String str1= "Salih";
        String str2= "SALIH";
        String str3= "SalIH";
        String str4= "salih";

        System.out.println(str4.equalsIgnoreCase(str2));
        System.out.println(str4.toUpperCase());
        boolean durum = (str4.equalsIgnoreCase(str2));
        if (durum);
        System.out.println(durum);
    }
}
