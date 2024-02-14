package CodeChallenges.Hafta5;

public class Method {
    public static void main(String[] args) {


        System.out.println(carpma());

    }
private static int carpma(){
    int a = (int) (Math.random()*100);
    System.out.println("a = " + a);
    int b = (int) (Math.random()*100);
    System.out.println("b = " + b);
    return a*b;
}

}


