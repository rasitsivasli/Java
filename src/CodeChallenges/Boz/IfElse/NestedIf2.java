package CodeChallenges.Boz.IfElse;

public class NestedIf2 {
    public static void main(String[] args) {


        //  1
        //  1  2
        //  1  2  3
        //  1  2  3  4

        for (int i = 1; i <=4; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.printf("%3d",j);
            }System.out.println();
        }
        System.out.println("*********");

        int n=1;
        while (n<5){
              int k=1;
            while (k <=n) {
                System.out.printf("%3d",k);
                k++;
            }
            System.out.println();
            n++;
        }
    }
}
