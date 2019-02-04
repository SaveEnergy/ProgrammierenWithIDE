package arena;

public class Knight implements Fighter {

  private String name;
  private int strength;

  public Knight(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getStrength() {
    return strength;
  }

}
