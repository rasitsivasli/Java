package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task26_cozumIki {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        // Task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
        // input-> javacanlara selam olsun
        // output-> javcnlr semou

        String str = "javacanlara selam olsun";
        tekrarsizMetin(str);

    }//main sonu

    private static void tekrarsizMetin(String str) {
        String yeniStr = "";
        for (int i = 0; i < str.length(); i++) {
            String ch = str.charAt(i)+"";
            if (!yeniStr.contains(ch)){
                yeniStr= ch+"";
            }

        }System.out.println("yeniStr = " + yeniStr);
    }


}
