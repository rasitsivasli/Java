package CodeChallenges.Hafta3;

public class Test3_tekAdetOlanRakamlariYzdir {
    public static void main(String[] args) {

            //Find unique char// tek adet olan harfleri bulun..
            String str = "nurayyysffggg";//
            //  0123456789
            String uniq = "";

            for (int i = 0; i < str.length(); i++) {
                char ch=str.charAt(i);//n
                if (str.indexOf(ch)== str.lastIndexOf(ch)){
                    uniq+=ch+",";
                }
            } System.out.println(uniq);
        }


    }










