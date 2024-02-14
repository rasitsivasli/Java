package CodeChallenges.Hafta4.Method;

public class NestedMetod {
    public static void main(String[] args) {


        adinNe();


    }

    private static void adinNe() {
        System.out.println("benim adim selami, senin adin ne");
        seninAdinNe();

    }

    private static void seninAdinNe() {
        System.out.println("saban");
        String soyAd = "sahin";
        soyadinNe(soyAd);


    }

    private static void soyadinNe(String soyAd) {
        System.out.println("soyAd = " + soyAd);
    }
}
