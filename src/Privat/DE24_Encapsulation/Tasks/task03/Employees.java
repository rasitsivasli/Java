package Privat.DE24_Encapsulation.Tasks.task03;

public class Employees {
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
    private String name;
    private int salary;
    private String dob;

    public Employees(String name, int salary, String dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dob='" + dob + '\'' +
                '}';
    }
}
