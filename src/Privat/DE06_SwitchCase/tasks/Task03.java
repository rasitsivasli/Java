package Privat.DE06_SwitchCase.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task-> Girilen hafta gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun

        Scanner scanner = new Scanner(System.in);
        System.out.print("gunNo : ");
        int gunNo = scanner.nextInt();

        switch (gunNo){
            case 1 : System.out.println("pzt"); break;
            case 2 : System.out.println("sali"); break;
            case 3 : System.out.println("cars."); break;
            case 4 : System.out.println("pers"); break;
            case 5 : System.out.println("cuma");break;
            case 6 : System.out.println("ctesi");break;
            case 7 : System.out.println("paz."); break;
            default: // yukarıdakilerin dışındaysa yani else ise
                System.out.println("yanlis giris yaptiniz");
        }

    }
}
