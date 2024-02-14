package CodeChallenges.Hafta4.Method;

public class MethodCreat {
    public static void main(String[] args) {
        // Statik metot icinde ancak statik bir metot cagirilir.
        MethodCreat.ilkMetot();
        int a = 10;
        int b = 7;
        buyukYaz(a,b);
        int toplam= MethodCreat.topla (a,b);
        int toplam2= Integer.sum(a,b);


    }

    public static int topla(int a, int b) {
        int sum = a+b;
        return sum;
    }

    private static void buyukYaz(int a, int b) {
        System.out.println(a>b? a:b);
    }

    public static void ilkMetot() {
        //   () parantez arasina,
        // bu metoda gönderecegimiz parametreler yazilir.
        // void : metot bize birsey geri göndermeyecek demektir.

        System.out.println("ilk metot cagrildi..");


    }
}
