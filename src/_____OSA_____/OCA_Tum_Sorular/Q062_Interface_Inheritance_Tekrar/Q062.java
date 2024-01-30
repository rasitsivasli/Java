package _____OSA_____.OCA_Tum_Sorular.Q062_Interface_Inheritance_Tekrar;

public class Q062 {

	 //in interface we can create in two ways abstract method 1)with abstract keyword. 2) without abstract keyword
    //when a class imp. an abstract class methods need to be initialize

}
interface Downloadable {
    public void download();
}

interface Readable extends Downloadable {   //line n1
    public void readBook();  //downloadi var sen implement etmesende ediyor
}

abstract class Book implements Readable {   //line n2
    public void readBook(){
        System.out.println("Read Buch");
    }

}

class EBook extends Book {       //line n3
    public void download(){} //soruda bu kismi yok  //classin icine interface deki methodlari implement etmek zorundasin
    public void readBook() {
        System.out.println("Read E-Buch");
    }

    public static void main(String[] args) {
        Book book1 = new EBook();
        book1.readBook();
    }}
/*


What is result?
A.Compilationfailsatlinen2.
B.ReadBook
C.ReadE-Buch
D.Compilationfailsatlinen1
E. Compilation fails at line n3.
*/
//answer E

//we need to add absract method in nonabstract class
// public void download(){
//
//    }



