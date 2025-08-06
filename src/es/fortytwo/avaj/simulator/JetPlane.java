package es.fortytwo.avaj.simulator;

// class JetPlane
// {
// +JetPlane(long p_id, string p_name, Coordinates p_coordinate)
// +void updateConditions()
// }
public class JetPlane extends Aircraft {
  public JetPlane(long p_id, String p_name, Coordinates p_coordinate) {
    // call the constructor of the Aircraft,
    // otherwise Java will call the default constructor of the superclass
    super(p_id, p_name, p_coordinate);
  }

  public void updateConditions() {
    final String weather = WeatherProvider.getProvider().getCurrentWeather(this.coordinates);
    int currentLongitude, currentLatitude, currentHeight;
    switch (weather) {
      case "SUN":
        currentLatitude = this.coordinates.getLatitude();
        currentHeight = this.coordinates.getHeight();
        this.coordinates.setLatitude(currentLatitude + 10);
        this.coordinates.setHeight(currentHeight + 2);
        System.out.format("%s: SUNNY", this.getLogInfo());
        checkHeight();
        break;
      case "RAIN":
        currentLatitude = this.coordinates.getLatitude();
        this.coordinates.setLatitude(currentLatitude + 5);
        System.out.format("%s: RAINY", this.getLogInfo());
        break;
      case "FOG":
        currentLatitude = this.coordinates.getLatitude();
        this.coordinates.setLatitude(currentLatitude + 1);
        System.out.format("%s: FOGGY", this.getLogInfo());
        break;
      case "SNOW":
        currentHeight = this.coordinates.getHeight();
        this.coordinates.setHeight(currentHeight - 7);
        System.out.format("%s: SNOWY", this.getLogInfo());
        checkHeight();
        break;
      default:
        break;
    }
  }
}
