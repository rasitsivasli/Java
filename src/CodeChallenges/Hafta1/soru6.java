package CodeChallenges.Hafta1;

public class soru6 {
    public static void main(String[] args) {
        //Bir variable tanimlayin sadece declare edin  : x
        //Baska bir variable initialize edin : y
        //x variable initialize edin
        //y variable'ı yeni bir value ile update ediniz.
        // int x;
        // int y=69;
        //Ardından x ve y değerlerini değiştirin.

        int x,y,gecici;
        x=58;
        y=69;
        gecici=y;
        y=x;
        x=gecici;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
