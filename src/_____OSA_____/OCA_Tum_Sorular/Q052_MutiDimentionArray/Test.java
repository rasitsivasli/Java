package _____OSA_____.OCA_Tum_Sorular.Q052_MutiDimentionArray;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String [] [] chs = new String [2] []; // chs.length =2
		chs[0] = new String [2];
		chs[1] = new String[5];
		System.out.println("chs = " + Arrays.deepToString(chs));
		int i =97;
		for (int a = 0; a < chs.length; a++) {
			for (int b = 0; b < chs.length; b++) {//length e kadar istemis 2 ye kadar
				chs [a][b]= " " + i;// Stringe d�n�st�r�yor
				i++;
			}
		}
		for (String[] ca : chs) {
			for (String c : ca) {
				System.out.print(c + " ");
			}
			System.out.println();
		}

	}
}

//What is the result?
//A. 97 98
//    99 100 null null null 
//B. 97 98
//    99 100 101 102 103
//C.	Compilation fails.
//D.	A NullPointerException is thrown at runtime.
//E.	An ArraylndexOutOfBoundsException is thrown at runtime.
