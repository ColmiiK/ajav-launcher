package es.fortytwo.avaj.simulator;

// class WeatherProvider <<Singleton>>
// {
// -string[] weather
// -WeatherProvider()
// +string getCurrentWeather(Coordinates p_coordinates)
// }
public class WeatherProvider {
  private static WeatherProvider instance = null;

  private String[] weather;

  private WeatherProvider() {
  }

  public static WeatherProvider getProvider() {
    if (instance == null)
      instance = new WeatherProvider();
    return instance;
  }

  public String getCurrentWeather(Coordinates p_coordinates) {
    // TODO:
    // Generate the weather
  }
}
