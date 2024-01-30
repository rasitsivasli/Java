package SerbetCalismalar.StreamApi;


interface Iface{

    boolean methot(int a);
}


public class LamdaTekrar {
    public static void main(String[] args) {
        Iface obj = p-> p%2==0;
        boolean bl = obj.methot(5);
        System.out.println("bl = " + bl);
    }


}
