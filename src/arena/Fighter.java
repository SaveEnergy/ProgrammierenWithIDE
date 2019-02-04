package arena;

import java.util.Random;

public interface Fighter {

  static int strength() {
    return new Random().nextInt(101);
  }

  default Fighter fightAgainst(Fighter fighter) {
    return this;
  }

}
