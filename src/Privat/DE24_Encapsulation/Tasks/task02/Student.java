package Privat.DE24_Encapsulation.Tasks.task02;

class Student {
    private String name;
    private int yas;

    public Student(String name, int yas) {
        setName(name);
        setYas(yas);
    }
    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYas() {
        return yas ;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Student name is '" + name + '\'' +
                ", He is "+yas+" years old"+
                '}';
    }
}
