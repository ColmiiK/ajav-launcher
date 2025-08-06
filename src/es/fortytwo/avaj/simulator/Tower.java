package es.fortytwo.avaj.simulator;

import java.util.ArrayList;
import java.util.List;

// class Tower
// {
// - List<Flyable*> observers
// +void register(Flyable* p_flyable)
// +void unregister(Flyable* p_flyable)
// #void conditionChanged()
// }
public class Tower {
  private List<Flyable> observers = new ArrayList<>();

  public void register(Flyable p_flyable) {
    final boolean result = observers.add(p_flyable);
    // if (result == false)
    // TODO: handle error
    System.out.format("Tower says: %s registered to weather tower.", p_flyable.getLogInfo());
  }

  public void unregister(Flyable p_flyable) {
    final boolean result = observers.remove(p_flyable);
    // if (result == false)
    // TODO: handle error
    System.out.format("Tower says: %s unregistered from weather tower.", p_flyable.getLogInfo());
  }

  protected void conditionChanged() {
    for (Flyable observer : observers) {
      observer.updateConditions();
    }
  }
}
