package CodeChallenges.Boz.IfElse;

public class NestedIf {
    public static void main(String[] args) {

                //   1 2 3 4
                //   2 4 6 8
                //   3 6 9 12


        for (int i = 1; i <=3 ; i++) {

            for (int j = 1; j <=4 ; j++) {

                System.out.printf("%3d",(j*i));
            }
            System.out.println();
        }
    }
}
