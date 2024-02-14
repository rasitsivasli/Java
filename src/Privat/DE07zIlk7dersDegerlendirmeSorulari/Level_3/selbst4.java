package Privat.DE07zIlk7dersDegerlendirmeSorulari.Level_3;

public class selbst4 {
    public static void main(String[] args) {

        String str = "Java anliyorum ve yazabiliyorum";
        System.out.println(str.replace("ve","and"));

        String str2 = "1Ja4va 8C9a2n5d1i1r.";


//  Replaceall ayni özellikleri iceren bir grupu kaldirmak istiyorsaniz

        System.out.println(str2 = str2.replaceAll("\\d", ""));
        System.out.println(str2.replaceAll("\\w", ""));

    }
}
