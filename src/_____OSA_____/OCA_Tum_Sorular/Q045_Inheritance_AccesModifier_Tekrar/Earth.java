package _____OSA_____.OCA_Tum_Sorular.Q045_Inheritance_AccesModifier_Tekrar;

abstract class Planet{
	 protected void revolve() {		// line n1
	}
	abstract void rotate();				// line n2
}

	 class Earth extends Planet{

		 void rotate() {

		 }

		 public void revolve() {		// line n3
		 }

}

//	 Which two modifications, made independently, enable the code to compile? (Choose two.) 
//			 A.	Make the method at line n1 public.
//			 B.	Make the method at line n2 public.
//			 C.	Make the method at line n3 public. 			√
//			 D.	Make the method at line n3 protected. 	√
//			 E.	Make the method at line n4 public.
