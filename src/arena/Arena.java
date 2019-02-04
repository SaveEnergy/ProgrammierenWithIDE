package arena;

import java.util.List;

public class Arena {

  private List<Fighter> fighters;

  public static Fighter fight(Fighter good, Fighter evil) {
    return good.fightAgainst(evil);
  }

  public static Arena createTournament() {
    return new Arena();
  }

  public Arena registerFighter(Fighter fighter) {
    fighters.add(fighter);
    return this;
  }

  public void startTournament() {
    System.out.println("------------------------------------------");
    fighters.forEach(System.out::println);
    System.out.println("-----------------------------------------");
  }

  public static void main(String[] args) {

    Arena
        .createTournament()
          .registerFighter(new Farmer("Sir Marco"))
          .registerFighter(new Knight("Doro"))
          .registerFighter(new Dragon("Glurak"))
          .registerFighter(new Knight("Eisenherz II"))
          .registerFighter(new Dragon("Glumanda"))
          .registerFighter(new Dragon("Glutexo"))
          .registerFighter(new Farmer("Bob"))
          .registerFighter(new Knight("Eisenherz III"))
        .startTournament();

  }

}
