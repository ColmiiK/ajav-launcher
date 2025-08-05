package es.fortytwo.avaj.simulator;

// class AircraftFactory <<Singleton>>
// {
// +Flyable* newAircraft(string p_type, string p_name, Coordinates
// p_coordinates)
// }
public class AircraftFactory {
  private static AircraftFactory instance = null;

  private AircraftFactory() {
  }

  public static AircraftFactory getFactory() {
    if (instance == null)
      instance = new AircraftFactory();
    return instance;
  }

  public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
    // TODO: Creates new aircraft of a given type with given data
  }
}
