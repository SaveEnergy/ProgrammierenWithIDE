package arena;

import java.util.Random;

public class Farmer implements Fighter {

  private String name;
  private int strength;

  public Farmer(String name) {
    this.name = name;
    this.strength = new Random().nextInt(101);
  }

  @Override
  public int strength() {
    return strength;
  }

  public String getName() {
    return name;
  }

}
