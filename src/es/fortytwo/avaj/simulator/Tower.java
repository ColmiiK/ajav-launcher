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
    observers.add(p_flyable);
    System.out.println("Tower says: " + p_flyable.getLogInfo() + " registered to weather tower.");
  }

  public void unregister(Flyable p_flyable) {
    observers.remove(p_flyable);
    System.out.println("Tower says: " + p_flyable.getLogInfo() + " unregistered from weather tower.");
  }

  protected void conditionChanged() {
    List<Flyable> temp = new ArrayList<>(this.observers);
    for (Flyable observer : temp) {
      observer.updateConditions();
    }
  }
}
