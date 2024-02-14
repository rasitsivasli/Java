package CodeChallenges.Hafta3;

public class Test2_YinelenenKarakterleriKaldirmaSelbst {
    public static void main(String[] args) {

        //Remove(kaldir) duplicate character from String

        String str = "Asya Cool School".toLowerCase();
        String yeniStr ="";

        for (int i = 0; i < str.length(); i++) {
            String ch = str.charAt(i)+"";
            if (!yeniStr.contains(ch)) {

                yeniStr +=ch;
            }

        }
        System.out.println(yeniStr);
    }
}







