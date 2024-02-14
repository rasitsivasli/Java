package CodeChallenges.Hafta6_Arrays;

public class Soru19_SatirSutunToplamlari_TekrarCoz {
    public static void main(String[] args) {
/*
        int[][] arr={{5,4,9,7},{3,5,7,8},{4,0,8,9}};
        //Dizinin tüm elemanlarının toplamı
        //Her satırın ve sütunun toplamı
        0. satırın toplamı: 25
        0. sutunun toplamı: 12
        1. satırın toplamı: 23
        1. sutunun toplamı: 9
        2. satırın toplamı: 21
        2. sutunun toplamı: 24
        Dizinin tüm elemanlarının toplamı:69 */

        int[][] arr={{5,4,9,7},{3,5,7,8},{4,0,8,9}};
        //Dizinin tüm elemanlarının toplamı
        //Her satırın ve sütunun toplamı

        int sum=0;
        int satir;
        int sutun;
        for (int i = 0; i < arr.length; i++) {//row satır dizinin ilk elemanına ulaşmak için {5,4,7,9}
            satir=0;
            sutun=0;

            for (int j=0; j < arr[i].length; j++) {//column sutun
                sum+=arr[i][j];
                satir+=arr[i][j];
            }
            for (int j = 0; j < arr.length; j++) {// sütunlara ulaşmak için
                sutun+=arr[j][i];
            }

            System.out.println(i+". satırın toplamı: "+satir);
            System.out.println(i+". sutunun toplamı: "+sutun);
        }
        System.out.println("Dizinin tüm elemanlarının toplamı:"+sum);



    }
}

