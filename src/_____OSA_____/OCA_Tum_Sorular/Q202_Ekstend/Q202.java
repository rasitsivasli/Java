package _____OSA_____.OCA_Tum_Sorular.Q202_Ekstend;


class Employee {
    public int salary;
} // salary
class Manager extends Employee{
    public int budget;
} //budget
class Director extends Manager{
    public int stockOptions;
} // stockOptions
public class Q202 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee director = new Director();
        // line n1

    }
}
/*
Which two options compile when placed at line n1 of the main method? (Choose two.)
A.	director.stockOptions = 1_000;
B.	employee.salary = 50_000;
C.	manager.budget = 1_000_000;
D.	manager.stockOption = 500;
E.	employee.budget = 200_000;
F.	director.salary = 80_000;
Answer: BF
 */
// director.stockOptions = 1_000;
//         employee.salary = 50_000;
//         manager.budget = 1_000_000;
//         manager.stockOption = 500;
//         employee.budget = 200_000;
//         director.salary = 80_000;