package es.fortytwo.avaj.simulator;

public class Simulator {
  public static void main(String[] args) {

    WeatherTower weatherTower = new WeatherTower();
    Coordinates coordinates = new Coordinates(1, 2, 3);
    System.out.println(weatherTower.getWeather(coordinates));

  }
}
