package uebungsblatt.vier.aufgabe4;

public class Greeting {
  public static void main(String... args) {
    int a = 1; // 1,2,3,4
    int b = 0; // 0,1,2,3
    if (b > 3) {
      System.out.println("Auf Wiedersehen!");
    } else if (a - 1 != b) {
      System.out.println("Tschuess!");
    } else {
      if (a <= 0) {
        System.out.println("Bis spaeter!");
      } else {
        System.out.println("Guten Tag!");
      }
    }
  }
}