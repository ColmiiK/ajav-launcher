package es.fortytwo.avaj.simulator;

// class AircraftFactory <<Singleton>>
// {
// +Flyable* newAircraft(string p_type, string p_name, Coordinates
// p_coordinates)
// }
public class AircraftFactory {
  private int helicopterId = 1;
  private int jetPlaneId = 1;
  private int balloonId = 1;

  private static AircraftFactory instance = null;

  private AircraftFactory() {
  }

  public static AircraftFactory getFactory() {
    if (instance == null)
      instance = new AircraftFactory();
    return instance;
  }

  public Flyable newAircraft(String p_type, String p_name, Coordinates p_coordinates) throws Exception {
    Aircraft aircraft = null;
    switch (p_type) {
      case "Helicopter":
        aircraft = new Helicopter(helicopterId, p_name, p_coordinates);
        helicopterId++;
        break;
      case "JetPlane":
        aircraft = new JetPlane(jetPlaneId, p_name, p_coordinates);
        jetPlaneId++;
        break;
      case "Baloon":
      case "Balloon":
        aircraft = new Balloon(balloonId, p_name, p_coordinates);
        balloonId++;
        break;
      default:
        throw new Exception("Unrecognized aircraft");
    }
    return aircraft;
  }
}
