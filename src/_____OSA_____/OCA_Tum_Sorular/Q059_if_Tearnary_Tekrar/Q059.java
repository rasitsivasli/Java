package _____OSA_____.OCA_Tum_Sorular.Q059_if_Tearnary_Tekrar;

public class Q059 {
	public static void main(String[] args) {
		double discount = 0;
		int qty = Integer.parseInt(args[0]);
		System.out.println("qty = " + qty);
		// line n1
		if (qty >= 90) {discount = 0.5;}
		if (qty > 80 && qty < 90) {discount = 0.2;}
	}
//	And given the requirements:
//	-	If the value of the qty variable is greater than or equal to 90,
//		discount = 0.5
//		If the value of the qty variable is between 80 and 90,discount = 0.2
	
//		Which two code fragments can be independently placed at line n1 to meet
//		the requirements? (Choose two.)

	/*
	 A. if (qty >= 90) {discount = 0.5;}
	 	 if (qty > 80 && qty < 90) {discount = 0.2;}
	 	 
	 B. discount = (qty >= 90) ? 0.5 : 0;
	 	discount = (qty > 80) ? 0.2 : 0;

	 C.	discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;
	 	 
	 D. if (qty > 80 && qty < 90) {
	 	 discount = 0.2;
	 	 }else{
	 	 discount - 0;
	 	 }
	 	 if (qty >= 90) {
	 	 	discount = 0.5;
	 	 }else {
	 	 	discount = 0;
	 	 }
	 	 
	 E.  discount = (qty > 80) ? 0.2 : (qty >= 90) ? 0.5 : 0;
	 
	 */
}
