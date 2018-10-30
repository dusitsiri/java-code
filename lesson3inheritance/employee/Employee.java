package lesson3inheritance.employee;

public abstract class Employee {
    private String name;
    protected double salary;

    public String getName() { return name; }

    public double getSalary() {
        return salary;
    }

    // use abstract when all subclasses need this function/method
    // but each of them behaves differently.
    public abstract void raiseSalary();
}
