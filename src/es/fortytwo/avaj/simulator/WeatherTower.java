package es.fortytwo.avaj.simulator;

// class WeatherTower
// {
// +string getWeather(Coordinates p_coordinates)
// +void changeWeather()
// }
public class WeatherTower extends Tower {
  public String getWeather(Coordinates p_coordinates) {
    return WeatherProvider.getProvider().getCurrentWeather(p_coordinates);
  }

  public void changeWeather() {
    this.conditionChanged();
  }
}
