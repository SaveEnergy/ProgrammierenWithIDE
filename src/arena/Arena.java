package arena;

public class Arena {

  public static Fighter fight(Fighter good, Fighter evil) {
    return good.fightAgainst(evil);
  }

  public static void main(String[] args) {
    Knight good = new Knight("Karl");
    Knight evil = new Knight("Bob");

    Arena.fight(good, evil);

    System.out.println("--------------------");
    System.out.println(good.getClass().getSimpleName() + " VS " + evil.getClass().getSimpleName());
    System.out.println();
    System.out.println("--------------------");

  }

}
