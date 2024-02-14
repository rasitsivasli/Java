package CodeChallenges.Hafta3;

public class Test5_for_textinIcindeBirKelimeGrubununKacKezGectiginiBulma {
    public static void main(String[] args) {
        // Dilim seni dilim dilim kesmeli
        //kaç tane "dil" içermektedir.


        String str = "Dilim seni dilim dilim kesmeli";
        str = str.toLowerCase();
        int sayac = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {

            if (str.startsWith("dil", i)) {
                sayac++;
            }
        }
        System.out.println("sayac = " + sayac);

        // 2. yol

        int i = 0;
        sayac = 0;
        while (i < n) {
            if (str.startsWith("dil", i)) {
                sayac++;

            }
            i++;
        }
//         3.yol
        String str2="";
        for (int j = 0; j <n-3 ; j++) {

            str2= str.substring(i,i+3); // sirayla her 3 harfi kopariyorum
            if (str.equalsIgnoreCase(str2)){
                sayac++;
            }
        }System.out.println("sayac = " + sayac);

    }
}
