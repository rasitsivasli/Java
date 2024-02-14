package Privat.DE08_Loops.L02_WhileLoops.Tasks;

public class Task04 {

	public static void main(String[] args) {
		/*
		Task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */


		int n=999;
		int counter=0;

		while (n>99){

			if (n%4==0 && n%6==0){
				System.out.print(n+",");
				counter++;
			}
			n--;

		}





	}

}
