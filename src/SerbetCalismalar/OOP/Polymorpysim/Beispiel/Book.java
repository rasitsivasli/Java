package SerbetCalismalar.OOP.Polymorpysim.Beispiel;

public class Book {
    String type = "Masal";
    String name ;
    public void sayfa(){
        System.out.println("BookManager 50 sayfa");
    }

    @Override
    public String toString() {
        return "Buch{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
