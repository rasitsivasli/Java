package _____OSA_____.OCA_Tum_Sorular.Q036_NestedFor;

public class Q36_3 {

	public static void main(String[] args) {
		// Contunie ve Break sadece d�ng�lerde kullanilir.
		// Contunie atlamak icin , break bulunan d�ng�den cikartir.
		// System.exit->> t�m programi termiante eder
		String[] arr = {"A", "B", "C", "D"};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " " ); //1. arr[0] =String "A"
			if (arr[i].equals("A")) {  // 1. returns true  
				continue; // 1. goes back into inner loop 
			}
			System.out.println("Work Done");  // printed out
			continue;  // goes back into the loop

		}
	}
}
