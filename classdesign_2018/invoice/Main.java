package classdesign_2018.invoice;

public class Main {
    public static void main(String[] args) {
        Product toaster = new Product("Toaster", 29.95, 3);
        Product hair_dryer = new Product("Hair Dryer", 24.95, 1);
        Product car_vacuum = new Product("Car Vacuum",19.99, 2);
        Product[] orderList = {toaster, hair_dryer, car_vacuum};
        Invoice invoice = new Invoice(orderList);
        invoice.printOrderList();

    }
}
