package _____OSA_____.OCA_Tum_Sorular.Q036_NestedFor;

public class Q36_2 {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D"};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " " ); //1. arr[0] =String "A"  -- 2.arr[1] = "B"
			if (arr[i].equals("C")) {  // 1. returns true  -- 2. returns false
				continue; // 1. continues in the loop -- 2. does not continue in the loop
			}
			System.out.println("Work Done");  // printed out

		}
	}
}
