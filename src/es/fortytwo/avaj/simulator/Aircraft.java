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
    this.id = p_id;
    this.name = p_name;
    this.coordinates = p_coordinates;
  }

  public void checkHeight() {
    final int height = this.coordinates.getHeight();
    if (height > 100)
      this.coordinates.setHeight(100);
    else if (height <= 0) {
      System.out.format("%s landing.", this.getLogInfo());
      weatherTower.unregister(this);
    }
  }

  // Must implement updateConditions() since
  // it's extending the abstract Flyable class
  public void updateConditions() {
  }

  public String getLogInfo() {
    return this.getClass().getSimpleName() + "#" + this.name + "(" + this.id + ")";
  }
}
