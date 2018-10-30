package lesson11designpattern.observer.cashregister;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaleFileObserver implements Observer {

    private PrintWriter out;

    public SaleFileObserver(String name) throws IOException {
        out = new PrintWriter(new FileWriter(name));
    }

    @Override
    public void update(double purchase) {
        out.println(purchase);
        out.flush();
    }

    public void close() {
        out.close();
    }
}
