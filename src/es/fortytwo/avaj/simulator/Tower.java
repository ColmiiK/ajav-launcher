package es.fortytwo.avaj.simulator;

import java.util.List;

// class Tower
// {
// - List<Flyable*> observers
// +void register(Flyable* p_flyable)
// +void unregister(Flyable* p_flyable)
// #void conditionChanged()
// }
public class Tower {
  private List<Flyable> observers;

  public void register(Flyable p_flyable) {
    final boolean result = observers.add(p_flyable);
    // if (result == false)
    // TODO: handle error
  }

  public void unregister(Flyable p_flyable) {
    final boolean result = observers.remove(p_flyable);
    // if (result == false)
    // TODO: handle error
  }

  protected void conditionChanged() {
    // TODO:
    // Notify all Aircraft so they update their data
    // run through observers calling their updateConditions()
  }
}
