package lesson1designatm.version2;

public class Customer {
    private int id;           // attributes
    private int pin;
    private String name;

    private BankAccount account;  // composition / association

    public Customer(int id, int pin, String name, BankAccount account) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean match(int pin) {
        return this.pin == pin;
    }
}
