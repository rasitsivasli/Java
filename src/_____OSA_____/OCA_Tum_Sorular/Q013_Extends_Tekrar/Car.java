package _____OSA_____.OCA_Tum_Sorular.Q013_Extends_Tekrar;

class Vehicle{
	int x;
	Vehicle(){
		this(10);			// line n1
	}
	Vehicle(int x){
		this.x= x;
	}
}
 class Car extends Vehicle{
	int y;

	Car(int y){

		this.y =y;
	}
	
	// And given the code fragment
	 public static void main(String[] args) {
		Vehicle y = new Car(20);  // in another version 20 is deleted ==> 10:0
		System.out.println(y);
	}}
 
// What is the result?
//		 A.	Compilation fails at line n2.
//		 B.	Compilation fails at line n1.
//		 C.	20:20
//		 D.	10:20





