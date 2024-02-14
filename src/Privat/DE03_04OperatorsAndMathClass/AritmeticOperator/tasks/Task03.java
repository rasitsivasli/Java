package Privat.DE03_04OperatorsAndMathClass.AritmeticOperator.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Task->
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
        Scanner scan=new Scanner(System.in);

		System.out.print("Uc basamakli bir sayi giriniz : ");
		int num1 = scan.nextInt() ;
		System.out.println("Toplam : "+(num1/100+num1%10));







	}

}
