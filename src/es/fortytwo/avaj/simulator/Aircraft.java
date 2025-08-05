package es.fortytwo.avaj.simulator;

// class Aircraft
// {
// #long id
// #string name
// #Coordinate coordinates
// #Aircraft(long p_id, string p_name, Coordinates p_coordinate)
// }
public class Aircraft extends Flyable {
  protected long id;
  protected String name;
  protected Coordinates coordinates;

  protected Aircraft(long p_id, String p_name, Coordinates p_coordinates) {
    // TODO
  }

  // Must implement updateConditions() since
  // it's extending the abstract Flyable class
  public void updateConditions() {
  }
}
