package _____OSA_____.OCA_Tum_Sorular.Q146_Concat;

import java.util.Arrays;

public class Q146 {
	public static void main(String[] args) {
		String[] strs = new String[2];
		System.out.println("strs.toString() = " + Arrays.toString(strs));
		int idx = 0;

		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
}
/*	 What is the result?
		A. Element 0Element 1
		B. Null element 0Nullelement 1
		C. NullNull
		D. A null pointer exception is thrown at runtime.
 */
