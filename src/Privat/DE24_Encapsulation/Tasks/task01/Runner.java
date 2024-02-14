package Privat.DE24_Encapsulation.Tasks.task01;

public class Runner {
    public static void main(String[] args) {
         /*Task->
     Bmi class fields -> name, age, weight,height: encapsulated
     getBMI() method -> bmi=weight/(height*height) return type olmalı
     getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal,
     30 dan kucukse kilolu, 30 ustu obez return type
     B_RunnerMusteri class obj ile dataları print eden code create ediniz*/

        Encaptulation kisi = new Encaptulation("Rasit", 40, 77, 170);
        System.out.println("kisi.getBmi() = " + kisi.getBmi());

    }
}
