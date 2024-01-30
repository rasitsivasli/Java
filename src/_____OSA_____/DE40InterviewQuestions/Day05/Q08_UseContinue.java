package _____OSA_____.DE40InterviewQuestions.Day05;

public class Q08_UseContinue {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

    public static void main(String[] args) {
String str = "asdasd qwerwer sdf dv";
String yeniStr = "";
        for (String e : str.split("")) {
            if (e.equals(" ")|| e.equals("a")) {
            }
            else yeniStr+=e;
        }
        System.out.println("yeniStr = " + yeniStr);
    }

}
