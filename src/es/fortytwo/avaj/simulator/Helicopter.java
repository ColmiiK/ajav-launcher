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
    // TODO:
    // getProvider().getCurrentWeather();
    // Update data according to type of Aircraft
  }

}
