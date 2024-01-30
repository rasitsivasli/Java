package SerbetCalismalar.OOP.Polymorpysim.Beispiel;

public class Rapunzel extends Book{

    String yazar = "Rasit";

    public void sayfa(){
        System.out.println("BookManager 100 sayfa");
    }


    public void sayfa(int sayi){
        System.out.println("BookManager "+sayi+" sayfa");
    }

    @Override
    public String toString() {
        return "Rapunzel{" +
                "yazar='" + yazar + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
