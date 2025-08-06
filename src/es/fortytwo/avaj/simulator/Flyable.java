package es.fortytwo.avaj.simulator;

// abstract Flyable
// {
// #WeatherTower weatherTower
// +abstract void updateConditions()
// +registerTower(WeatherTower* p_tower)
// }
public abstract class Flyable {

  protected WeatherTower weatherTower;

  public abstract void updateConditions();

  public abstract String getLogInfo();

  public void registerTower(WeatherTower p_tower) {
    this.weatherTower = p_tower;
  }
}
