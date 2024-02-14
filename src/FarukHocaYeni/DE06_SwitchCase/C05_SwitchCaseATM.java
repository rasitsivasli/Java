package DE06_SwitchCase;

import java.util.Scanner;

public class C05_SwitchCaseATM {
    public static void main(String[] args) {
        /*
        TaskATM-> Bakıye 1000$ olan bir banka hesabı için bakıye öğrenme-para çekme-para yatırma
         ve çıkış işlemlerinin yapıldığı bir ATM app. create ediniz
         */
        int bakiye = 1000;
        System.out.println("   ***   ");
        System.out.println("   $$$ JavaBANK ATM'YE HOŞ GELDİNİZ $$$   ");

        Scanner input = new Scanner(System.in);
        System.out.println(" gardaş hele ne verim ne istirsen : \nBakıye->1\nPara yatırma->2\nPara çekme->3\nÇıkış->4 ");
        int tercih = input.nextInt();

        switch (tercih) {
            case 1://bakıye verme işlemi

                System.out.println("bakıyeniz : " + bakiye);
                break;
            case 2://Para yatırma işlemi

                System.out.println("gardaş ne kadar yatirirsen :");
                int yatirilanMiktar = input.nextInt();
                bakiye += yatirilanMiktar;
                System.out.println("yatırdıktan sonraki bakıyeniz:"+bakiye);
                break;
            case 3://para çekme işlemi

                System.out.println("gardaş ne kadar çekirsen :");
                int cekilenMiktar = input.nextInt();
                if (cekilenMiktar <= bakiye) {//bakıyeden az olan cekme miktarı kontrol edildi
                    bakiye -= cekilenMiktar;
                    System.out.println("çelimde  sonraki bakıyeniz:"+bakiye);
                } else System.out.println("gardaş ne idirsen olmayan para mı çekirsen :(");
                break;


            case 4://çıkış işlemi
                System.out.println("gardaş selametle yine bekleriz :)");
                break;
            default:
                System.out.println("gardaş atm ye ilk defa mı gelirsen :)");


        }
        System.out.println("dadaş code cincik oldu DEWAMKEE...");
    }
}
