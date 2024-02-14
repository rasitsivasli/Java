package _____OSA_____.OCA_Tum_Sorular.Q177_PolyMor_Tekrar;

public class Peacock extends Bird {
		public  void dance() {
			System.out.println("Dance.");
		}
		
			public static void main(String[] args) {
				/* insert code snippet here */

				Bird b = new Peacock();
				 Peacock p = (Peacock) b;


			p.fly();
				p.dance();
			}
}
/* Which code snippet can be inserted to print Fly.Dance. ?

A.	Bird p = new Peacock();

B.

C.	Peacock b = new Peacock ();
	Bird p = (Bird) b;

D.	Bird b = new Peacock ();
	Peacock p = (Peacock) b;

Answer: D



*/