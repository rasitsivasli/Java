package Privat.DE24_Encapsulation.Tasks.task03;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Runner {
    /*Task->
     B_RunnerMusteri ve  Employees, class cerate ediniz
    Employees(Çalışanlar) class'ında;
    encapsulated variable'ları oluşturunuz;
    String name,
    int salary,
    String dob (date of birth) (Doğum tarihi)


    B_RunnerMusteri class'ın içinde;
   obj ile
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000

    Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
    Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
    Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have j12_Arrays.PassingArraysToMethods 80000 salary yazdırınız.

trick: ageCalculator isminde bir method için  Şuanki tarih - doğum yılı = employee age*/
    public static void main(String[] args) {
        Employees person = new Employees("Fernando", 8000, "11/23/2000");
        LocalDate suankiTarih = LocalDate.now();
        LocalDate dob = LocalDate.of(2000, 11, 23);

        ageCalculator(suankiTarih, dob);
    }

    private static void ageCalculator(LocalDate suankiTarih, LocalDate dob) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Suanki Tarih : " + dtf.format(suankiTarih));
        System.out.println("Fernandonun Dogum Taihi: " + dtf.format(dob));

        long gunFarki = ChronoUnit.DAYS.between(dob, suankiTarih);// İki tarih arasındaki gün farkını bul
        System.out.println("gunFarki = " + gunFarki);
        double yas = (double) gunFarki / 360;
        System.out.println("Tam olarak yas : " + yas);
        if (yas > 18) System.out.println("Welcome to our company Fernando your salary is 80000");
        else if (yas < 18) System.out.println("come back when you are 18 years old");
        else System.out.println("we can have inter with you , you can have 80000 salary");



    }
}
