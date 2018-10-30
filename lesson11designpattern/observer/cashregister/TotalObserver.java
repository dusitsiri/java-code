package lesson11designpattern.observer.cashregister;

public class TotalObserver implements Observer {
    private double total;

    @Override
    public void update(double purchase) {
        total += purchase;
        display();
    }

    private void display() {
        System.out.println("Total sale : " + total);
    }
}
