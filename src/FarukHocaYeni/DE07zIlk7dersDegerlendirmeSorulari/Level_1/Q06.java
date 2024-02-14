package FarukHocaYeni.DE07zIlk7dersDegerlendirmeSorulari.Level_1;

public class Q06 {
    public static void main(String[] args) {
        // Verilen bir stringing, ilk ve son karekterini ekrana yazdırın
        // Örnek    input  : "Selamlar"
        //          Output : "Sr"

        String str = "Selamlar";

        System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
    }
}
