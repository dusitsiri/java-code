package lesson11designpattern.observer.weatherstation;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
