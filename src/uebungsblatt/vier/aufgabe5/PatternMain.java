package uebungsblatt.vier.aufgabe5;

import java.util.Scanner;

public class PatternMain {
  public static void main(String[] args) {
    System.out.print("Geben Sie die Größe des Musters ein: ");
    int input = new Scanner(System.in).nextInt();

    String plus = "+ ";
    String minus = "- ";
    String current = plus;

    for (int row = 0; row < input; row++) {
      for (int col = 0; col < input; col++) {
        if (col >= row) {
          System.out.print(current);
        } else {
          System.out.print(current);
          current = current.equals(plus) ? minus : plus;
        }
      }
      System.out.println();
    }


  }
}
