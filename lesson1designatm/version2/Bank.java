package lesson1designatm.version2;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private String bankName;   // attribute

    private Map<Integer, Customer> customers;  // composition / association

    public Bank(String name) {
        this.bankName = name;
        this.customers = new HashMap<>();
    }
    public void addCustomer(Customer c) {
        customers.put(c.getId(), c);
    }
    public Customer findCustomer(int custId) {
        return customers.get(custId);
    }

    public final boolean validateCustomer(int custId, int pin) {
        Customer customer = findCustomer(custId);
        if (customer != null && customer.match(pin)) {
            return true;
        }
        return false;
    }
}
