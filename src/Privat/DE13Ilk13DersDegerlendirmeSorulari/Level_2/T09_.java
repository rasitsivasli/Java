package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

public class T09_ {
    public static void main(String[] args) {
      /*    String str = "10/11/2023 şeklinde bir tarih veriliyor
      bunu bir gün ileri alın 11/11/2023 olsun, (şubat ayı 28 kabul edilsin)
      örnek 2 : input  : 31/12/2023
                output : 01/01/2024

       */
        String str = "31/12/2023";
        int gun = Integer.parseInt(str.substring(0, 2));
        int ay = Integer.parseInt(str.substring(3, 5));
        int yil = Integer.parseInt(str.substring(6));

        int ayGunSayisi = 0;

        switch (ay) {
            case 1, 3, 5, 7, 8, 10, 12:
                gun = 31;
                break;
            case 4, 6, 9, 11:
                gun = 30;
                break;
            case 2:
                gun = 28;
                break;
        }


        if (gun < ayGunSayisi) gun++;
        else {
            gun = 1;
            if (ay < 12) {
                ay++;
            } else {
                ay = 1;
                yil++;
            }
        }

        String strGun = "" + gun;
        String strAy = "" + ay;

        if (strGun.length() == 1) {
            strGun = "0" + gun;
        }
        if (strAy.length() == 1) {
            strAy = "0" + ay;
        }
        System.out.println("str = " + str);

        str = strGun + "/" + strAy + "/" + yil;
        System.out.println("str = " + str);
    }
}

