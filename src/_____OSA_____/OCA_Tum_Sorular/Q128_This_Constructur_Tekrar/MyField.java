package _____OSA_____.OCA_Tum_Sorular.Q128_This_Constructur_Tekrar;

public class MyField {
    int x;
    int y;
    public void doStuff(int x, int y) {
        x = x;
        y = this.y;
        System.out.println("y = " + y);


    }
    public void display() {

        System.out.print(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        MyField m1 = new MyField();
        m1.x = 100;
        m1.y = 200;
        MyField m2 = new MyField();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();
    }
}
/*

		What is the result?
		A. 100 200 : 0 0 :
		B. 100 200 : 100 0 :
		C. 100 200 : 100 200 :
		D. 0 0 : 100 0 :






/Answer A.  100 200 : 0 0 :
*/
