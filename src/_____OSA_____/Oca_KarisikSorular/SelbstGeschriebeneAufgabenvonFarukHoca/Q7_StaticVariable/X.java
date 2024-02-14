package _____OSA_____.Oca_KarisikSorular.SelbstGeschriebeneAufgabenvonFarukHoca.Q7_StaticVariable;

public class X {
    static int i;
    int j;

    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new X();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;// static olan verileri elle yazdik, normalde java göstermiyor cünkü tüm objelerin degeri degisiyor
        x2.j = 6;
        System.out.println(x1.i + " " + x1.j + " " + x2.i + " " + x2.j);
    }

}
