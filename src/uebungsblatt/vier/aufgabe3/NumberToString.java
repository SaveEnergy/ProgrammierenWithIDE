package uebungsblatt.vier.aufgabe3;

import java.util.Scanner;

public class NumberToString {
  public static void main(String[] args) {
    System.out.print("Positive ganze Zahl: ");
    String input = new Scanner(System.in).next();
    char[] numbers = input.toCharArray();

    System.out.print(input + " zerlegt Rückwärts:");
    for (int index = numbers.length - 1; index >= 0; index--) {
      switch (numbers[index]) {
        case '0':
          System.out.print(" null");
          break;
        case '1':
          System.out.print(" eins");
          break;
        case '2':
          System.out.print(" zwei");
          break;
        case '3':
          System.out.print(" drei");
          break;
        case '4':
          System.out.print(" vier");
          break;
        case '5':
          System.out.print(" fünf");
          break;
        case '6':
          System.out.print(" sechs");
          break;
        case '7':
          System.out.print(" sieben");
          break;
        case '8':
          System.out.print(" acht");
          break;
        case '9':
          System.out.print(" neun");
          break;
        default:
          System.out.println(" woops!");
          break;
      }
    }
  }
}
