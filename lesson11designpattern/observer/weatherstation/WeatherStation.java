package lesson11designpattern.observer.weatherstation;

public class WeatherStation {
    public static void main(String[] args) {


        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay =
                new CurrentConditionDisplay(weatherData);

        StatisticsDisplay statDisplay = new StatisticsDisplay();
        weatherData.registerObserver(statDisplay);

        weatherData.setMeasurements(25, 65, 30.4f);
        weatherData.setMeasurements(27, 50, 29.2f);
        weatherData.removeObserver(statDisplay);
        weatherData.setMeasurements(21, 90, 29.2f);
    }
}
