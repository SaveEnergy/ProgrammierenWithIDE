package uebungsblatt.vier.aufgabe2;

import java.util.Scanner;

public class TriangleToConsole {
  public static void main(String[] args) {
    System.out.print("Anzahl der Zeilen: ");
    int input = new Scanner(System.in).nextInt();

    System.out.println();
    StringBuilder outPut = new StringBuilder();
    for (int i = 0; i < input; i++) {
      System.out.println(outPut.append("*"));
    }

  }
}
