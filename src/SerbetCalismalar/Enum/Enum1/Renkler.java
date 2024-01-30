package SerbetCalismalar.Enum.Enum1;

import java.util.Arrays;

public enum Renkler {

    RED,
    BLUE,
    BLACK,
    WHITE,
    GRAY,
    GREEN;

    public static void main(String[] args) {
        System.out.println("RED.name() = " + RED.name());
        Renkler [] renklers = Renkler.values();// Data Type renkler olan bir dizi olusturduk.
        System.out.println(Arrays.toString(renklers));

        String [] strDizi = new String[Renkler.values().length];

        for (int i = 0; i < strDizi.length; i++) {
            strDizi[i]= renklers[i].toString();
        }
        System.out.println(Arrays.toString(strDizi));

        System.out.println("Renkler.values() = " + Arrays.toString(Renkler.values()));
    }
}

