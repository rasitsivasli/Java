package _____OSA_____.OCA_Tum_Sorular.Q037_Contunie_If_Tekrar;

public class Q37_2 {

	public static void main(String[] args) {
		int data [] = {2010, 2013, 2014, 2015, 2014};
		int key = 2014;
		int count = 0;
		for (int e : data) {
			if (e !=key) {
				continue;// contunie nin altinda birsey olursa CTE hatasi verir
				//count++;

			}
		}
		System.out.println(count + " Found");
		
	}
}
