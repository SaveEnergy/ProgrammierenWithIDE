package singelton;

public class Singelton {

  private static Singelton ourInstance = null;
  private static int COUNT = 0;

  public static Singelton getInstance() {
    if (ourInstance == null) {
      ourInstance = new Singelton();
    }
    return ourInstance;
  }

  private String something;

  public Singelton() {
    COUNT++;
  }

  public static int getCOUNT() {
    return COUNT;
  }

  public void setSomething(String something) {
    this.something = something;
  }

  public String getSomething() {
    return something;
  }

}
