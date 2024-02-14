package CodeChallenges.Hafta3;

public class Test3_tekAdetOlanHarfleriYzdir {
    public static void main(String[] args) {

        //Find unique char// tek adet olan harfleri bulun..
        String str = "nurayyysffggg";//
        //  0123456789

        String harfler = "";
        for (int i = 0; i < str.length(); i++) {

            String ch = str.charAt(i) + "";

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {

             harfler+=ch+",";
            }
        }
        System.out.println("harfler = " + harfler);


    }


}










