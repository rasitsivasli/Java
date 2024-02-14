package Privat.DE21_StaticKeyWord.Tasks.Task03_Student;

public class Lesson {
    String name;
    int credit;

    public Lesson() {
    }

    public Lesson(String name, int credit) {
        if (credit<1){
            credit=1;
            System.out.println("Dersin kredisi 1 den kucuk olamaz, 1 olarak düzeltildi");
        }
        if (credit>10){

            System.out.println("Dersin kredisi 10 dan buyuk olamaz.");
        }
        this.name = name;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", lesson=" + credit +
                '}';
    }
}
