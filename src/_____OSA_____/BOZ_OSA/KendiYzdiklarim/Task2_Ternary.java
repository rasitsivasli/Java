package _____OSA_____.BOZ_OSA.KendiYzdiklarim;

public class Task2_Ternary {
    public static void main(String[] args) {
        int x = 5;

        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);

        // Ekstra : verilen bir sayinin tek mi cift mi old. bulalim

        System.out.print("Random 1 ile 100 arasinda bir sayi olusturuldu: ");
        int random = (int) (Math.random() * 100 + 1);
        System.out.println(random);

        System.out.println("Sayi " + (random % 2 == 0 ? "cifttir" : "tektir"));
        System.out.println("Sayi " + (random % 2 == 0 ? "cifttir" : "tektir"));
    }
}
