package _____OSA_____.OCA_Tum_Sorular.Q056_Str_Maniplation;

public class Q056 {

	public static void main(String[] args) {
		String str = " "; // there is white space , not empty
		str.trim(); //// it is not assigned to string, no affect
		System.out.println(str.equals("") + " " + str.isEmpty());
	}
}
//What is the result?
//A.	true true
//B.	true false
//C.	false false
//D.	false true

