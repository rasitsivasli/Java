package _____OSA_____.OCA_Tum_Sorular.Q078_Equals_Esitlik;

public class Q078 {
	public static void main(String[] args) {
		String str1="Java";
		String []str2= {"J","a","v","a"};
		String str3="Ja"+"va";
		for (String str:str2) {
			str3=str3+str;
		}

		boolean b1 = (str1.equals(str3));
		boolean b2 = (str1==str3);
		System.out.println(b1+", "+b2);
	}

}
/**
 * What is the result?
A. false, false
B. false, true
C. true, false
D. true, true
*/




// Answer C