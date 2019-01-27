package uebungsblatt.vier.aufgabe1;

import java.util.Scanner;

public class Multiple {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Geben Sie ein Zahl ein: ");
    int number = input.nextInt();
    System.out.print("Die Vielfachen (1-10) von " + number + ":");
    for (int factor = 1; factor <= 10; factor++) {
      System.out.print(" " + (factor * number));
    }
  }
}