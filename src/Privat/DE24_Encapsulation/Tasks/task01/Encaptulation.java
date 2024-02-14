package Privat.DE24_Encapsulation.Tasks.task01;

public class Encaptulation {
    /*Task->
     Bmi class fields -> name, age, weight,height: encapsulated
     getBMI() method -> bmi=weight/(height*height) return type olmalı
     getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal,
     30 dan kucukse kilolu, 30 ustu obez return type
     B_RunnerMusteri class obj ile dataları print eden code create ediniz*/

    private String name;
    private int age;
    private int weight;
    private double height;
    private double bmi;


    public Encaptulation(String name, int age, int weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        height=height/100;
        this.bmi = weight / (height * height);
    }

    public double getBmi() {
        return bmi;
    }

    public String getStatus() {
        if (bmi < 18.5) {
            return "Zayif";
        } else if (bmi < 25) {
            return "normal";
        } else if (bmi < 30) {
            return "kilolu";
        } else {
            return "obez";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.bmi=weight / (height * height);
        this.weight = weight;
    }

    public int getHeight() {
        return (int) height;
    }

    public void setHeight(double height) {
        this.bmi=  weight / (height * height);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Encaptulation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public Encaptulation() {
    }
}
