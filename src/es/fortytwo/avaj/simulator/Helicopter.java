package es.fortytwo.avaj.simulator;

// class Helicopter
// {
// +Helicopter(long p_id, string p_name, Coordinates p_coordinate)
// +void updateConditions()
// }
public class Helicopter extends Aircraft {
  public Helicopter(long p_id, String p_name, Coordinates p_coordinate) {
    // call the constructor of the Aircraft,
    // otherwise Java will call the default constructor of the superclass
    super(p_id, p_name, p_coordinate);
  }

  public void updateConditions() {
    final String weather = weatherTower.getWeather(this.coordinates);
    int currentLongitude, currentLatitude, currentHeight;
    switch (weather) {
      case "SUN":
        currentLongitude = this.coordinates.getLongitude();
        currentHeight = this.coordinates.getHeight();
        this.coordinates.setLongitude(currentLongitude + 10);
        this.coordinates.setHeight(currentHeight + 2);
        System.out.println(this.getLogInfo() + ": SUNNY");
        checkHeight();
        break;
      case "RAIN":
        currentLongitude = this.coordinates.getLongitude();
        this.coordinates.setLongitude(currentLongitude + 5);
        System.out.println(this.getLogInfo() + ": RAINY");
        break;
      case "FOG":
        currentLongitude = this.coordinates.getLongitude();
        this.coordinates.setLongitude(currentLongitude + 1);
        System.out.println(this.getLogInfo() + ": FOGGY");
        break;
      case "SNOW":
        currentHeight = this.coordinates.getHeight();
        this.coordinates.setHeight(currentHeight - 12);
        System.out.println(this.getLogInfo() + ": SNOWY");
        checkHeight();
        break;
      default:
        break;
    }
  }
}
