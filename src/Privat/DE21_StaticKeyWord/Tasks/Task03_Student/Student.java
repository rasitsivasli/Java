package Privat.DE21_StaticKeyWord.Tasks.Task03_Student;

import java.util.ArrayList;

public class Student {

    String name;
    int maxKredit;
    ArrayList<Lesson> dersList =new ArrayList<>();
    public Student() {
    }
    public Student(String name, int maxKredit, ArrayList<Lesson> dersList) {
        this.name = name;
        this.maxKredit = maxKredit;
        this.dersList = dersList;
    }

    public Student(String name, int maxKredit) {
        this.name = name;
        this.maxKredit = maxKredit;
    }
    public  int toplamCredi(){
        int toplamKr = 0;

        for (Lesson les: dersList) {
            toplamKr+=les.credit;
        }
        return toplamKr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", maxKredit=" + maxKredit +
                ", dersList=" + dersList +
                '}';
    }
}

