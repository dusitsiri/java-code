package classdesign_2018.test;

public class Student implements Measurable{
    private String name;
    private double age;
    private double gpa;

    public Student (String name, double age){
        this.name = name;
        this.age = age;
    }

    @Override
    public double getMeasure() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }
}
