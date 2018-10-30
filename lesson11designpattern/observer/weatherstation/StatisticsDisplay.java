package lesson11designpattern.observer.weatherstation;

public class StatisticsDisplay implements Observer {
    private float maxTemp;
    private float maxHumid;

    public StatisticsDisplay() {
        maxTemp = -1000;
        maxHumid = -1000;
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        if (maxTemp < temp) {
            maxTemp = temp;
        }
        if (maxHumid < humidity) {
            maxHumid = humidity;
        }
        display();
    }
    public void display() {
        System.out.println("Statistics Display: " +
                            "max temp = " + maxTemp +" C degree " +
                            "max humid = " + maxHumid + "%");
    }
}
