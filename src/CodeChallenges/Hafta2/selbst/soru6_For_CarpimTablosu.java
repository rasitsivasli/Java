package CodeChallenges.Hafta2.selbst;

public class soru6_For_CarpimTablosu {
    public static void main(String[] args) {


        int carpim = 1;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 10; j++) {
                carpim = i*j;
                System.out.print(carpim+"\t");
            }

            System.out.println(carpim+"\t");
        }


    }
}
