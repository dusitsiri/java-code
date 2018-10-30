package lesson3inheritance.employee;

public class MonthlyEmployee  extends Employee {

    @Override
    public void raiseSalary() {
        salary = salary * 1.10;
    }
}
