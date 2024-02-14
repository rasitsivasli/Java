package CodeChallenges.Hafta3;

public class Test7_doWhile_SayilarinToplami {
    public static void main(String[] args) {


        // 10 dan 21 e kadar olan sayilarin toplami

        int n=21;
        int sum=0;

        do {
            sum+=n;
            n--;
        }while (n>=10);
        System.out.println(sum);


    }
}
