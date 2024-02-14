package Privat.DE03_04OperatorsAndMathClass.AritmeticOperator.tasks;

public class Task01 {
	public static void main(String[] args) {
       // print lerde ne yazar el ile hesaplayınız
        int x = 4;
        x++;
        x += x;
        --x;
        x = 7 + x;
        x *= x;
        x -= 3;

        System.out.println(" x = " + x);

        int a = 3;
        double d = 4.5;
        d += a;//7.5
        a += d;//10.5
        d -= a;//7.5-10=-2.5
        a -= d;//12.5
        System.out.println(" d = " + ++d);
        System.out.println(" a = " + a--);




    }

}
