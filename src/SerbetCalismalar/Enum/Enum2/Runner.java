package SerbetCalismalar.Enum.Enum2;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        User kisi1 = new User("Hasan",Role.ADMIN,Status.AKTIVE);
        User kisi2 = new User("Seyda",Role.COSTUMER,Status.INACTIVE);
        Status ss = Status.valueOf("INACTIVE");
        System.out.println(ss);

        // dosyaya veriyi yazarken kullaniriz
        System.out.println("ss.ordinal() = " + ss.ordinal());
        int index = 1;
        // enum in index ini kullanarak elde ettik
        // dosyadan okurken bunu kullanabiliriz
        Status[] values = Status.values();
        System.out.println(Arrays.toString(values));
        ss = values[index];
        System.out.println("ss = " + ss);
        kisi1.setDurum(ss);
        System.out.println(kisi1.getDurum());

    }
}
