package arena;

public interface Fighter {

  String getName();
  int strength();

  default Fighter fightAgainst(Fighter fighter) {
    return this.strength() > fighter.strength() ? this : fighter;
  }

}
