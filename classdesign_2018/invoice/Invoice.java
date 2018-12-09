package classdesign_2018.invoice;

public class Invoice implements Printable{
    private Product[] product;
    private String address;

    public Invoice(Product[] product){
        address = "Sam's Small Appliances \n100 Main Street \nAnytown, CA 98765 \n";
        this.product = product;
    }

    @Override
    public void printOrderList() {
        System.out.println("                INVOICE             \n\n" + address +'\n');
        System.out.println("Description                 Price       Qty     Total \n");
        double sumTotal = 0;
        for (Product product: this.product){
            sumTotal += product.getTotalProduct();
            System.out.print(product.getNameProduct()+"                     "+
                              product.getPriceProduct()+"       "+
                                product.getQualityProduct()+"       "+
                                    product.getTotalProduct()+'\n');
        }
        System.out.println();
        System.out.println("AMOUNT DUE: $ "+sumTotal);
    }

}
