package CodeChallenges.Hafta3;

public class Test2_YinelenenKarakterleriStringtenKaldirma {
    public static void main(String[] args) {

        //Remove duplicate character from String

        String str = "Asya Cool School".toLowerCase();
        String yeniStr = "";// isleme etki etmeyecek yeni bir string tanimladik

        for (int i = 0; i < str.length(); i++) {
            String ch = str.charAt(i)+"";
            if (!yeniStr.contains(ch)) {

                yeniStr = yeniStr + ch;
            }

        }
        System.out.println(yeniStr);


    }
}






