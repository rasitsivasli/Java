package Privat.DE12_Arrays.Tasks;

public class Task11_DolarEurolariAyriAyriToplama {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        dolarAndEuroSum(str);

    }

    private static void dolarAndEuroSum(String str) {
        String[] strYeni = str.split(" ");
        int toplamDolar = 0;
        int toplamEuro = 0;
        for (int i = 0; i < strYeni.length; i++) {
            if (strYeni[i].startsWith("$")) {
                toplamDolar += Integer.parseInt(strYeni[i].substring(1));
            } else toplamEuro += Integer.parseInt(strYeni[i].substring(1));

        }
        System.out.println("toplamEuro = " + toplamEuro);
        System.out.println("toplamDolar = " + toplamDolar);

    }
}
