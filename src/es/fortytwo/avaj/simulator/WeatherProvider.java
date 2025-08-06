package es.fortytwo.avaj.simulator;

// class WeatherProvider <<Singleton>>
// {
// -string[] weather
// -WeatherProvider()
// +string getCurrentWeather(Coordinates p_coordinates)
// }
public class WeatherProvider {
  private static WeatherProvider instance = null;

  private String[] weather = { "SUN", "RAIN", "FOG", "SNOW" };
  private final int HASH_SEED_X = 31;
  private final int HASH_SEED_Y = 37;
  private final int HASH_SEED_Z = 41;

  private WeatherProvider() {
  }

  public static WeatherProvider getProvider() {
    if (instance == null)
      instance = new WeatherProvider();
    return instance;
  }

  public String getCurrentWeather(Coordinates p_coordinates) {
    final int startingHash = 17;
    int hash = startingHash;
    hash *= HASH_SEED_X + p_coordinates.getLongitude();
    hash *= HASH_SEED_Y + p_coordinates.getHeight();
    hash *= HASH_SEED_Z + p_coordinates.getLatitude();
    int index = Math.floorMod(hash, weather.length);
    return weather[index];
  }
}
