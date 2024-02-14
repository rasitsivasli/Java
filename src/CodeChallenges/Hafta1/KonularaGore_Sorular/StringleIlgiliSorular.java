package CodeChallenges.Hafta1.KonularaGore_Sorular;

public class StringleIlgiliSorular {
    public static void main(String[] args) {
        String str = "Rasit";
        String str2 = "rasit";
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.equals(str2));
        System.out.println(str.substring(0).toLowerCase());


        String str5 = "Asya Cowl";// sadece w yi yazdir

        System.out.println(str5.substring(str5.lastIndexOf("o")+1,str5.lastIndexOf("o")+2));
    }


}
