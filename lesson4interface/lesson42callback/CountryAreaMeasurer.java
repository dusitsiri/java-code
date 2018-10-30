package lesson4interface.lesson42callback;

public class CountryAreaMeasurer implements Measurer {

    @Override
    public double measure(Object obj) {

        // not safe, since object may not be Country
        Country country = (Country) obj;
        return country.getArea();
    }
}
