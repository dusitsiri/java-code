package lesson3inheritance.employee;

public class DailyEmployee extends Employee {
    @Override
    public void raiseSalary() {
        salary = salary + 100;
    }
}
