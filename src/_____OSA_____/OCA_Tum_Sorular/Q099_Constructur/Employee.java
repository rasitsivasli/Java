package _____OSA_____.OCA_Tum_Sorular.Q099_Constructur;

public class Employee {

	private String name;
	private int age;
	private int salary;

public Employee (String name,int age) {
	setName (name);
	setAge (age);
	setSalary (2000);
}

//	public Employee() {
//	}

	public Employee (String name, int age, int salary) {

		setSalary (salary);
//		this(name,age);

//		   //this üst satırda olursa hata vermez.

	}


// getter and setter methods for attributes go here	
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
	public int getSalary(int i) {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printDetails () {
		System.out.println(name +" : "+age+" : "+salary);
	}
}
