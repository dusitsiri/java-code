package classdesign_2018.invoice;

public class Product {
    private String nameProduct;
    private double priceProduct;
    private int qualityProduct;
    private double totalProduct;

    public Product(String nameProduct, double priceProduct, int qualityProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = Double.parseDouble(String.valueOf(priceProduct).format("%.2f",priceProduct));
        this.qualityProduct = qualityProduct;
        this.totalProduct = priceProduct*qualityProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getQualityProduct() {
        return qualityProduct;
    }

    public void setQualityProduct(int qualityProduct) {
        this.qualityProduct = qualityProduct;
    }

    public double getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(double totalProduct) {
        this.totalProduct = totalProduct;
    }

    @Override
    public String toString() {
        return   nameProduct + '\'' +
                 priceProduct +
                 qualityProduct +
                 totalProduct ;
    }
}
