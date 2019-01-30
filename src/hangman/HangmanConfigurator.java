package hangman;

import java.util.Scanner;

public class HangmanConfigurator {

  public HangmanConfig initialInput() {

    Scanner console = new Scanner(System.in);

    System.out.print("Spieler 1: Bitte gib das zu erratende Wort "
        + "ein und drücke danach enter! ");
    char[] word = console.nextLine().toCharArray();

    System.out.print("Spieler 1: Wie viele Versuche "
        + "bekommt Spieler 2? ");
    int tries = console.nextInt();

    return new HangmanConfig(word, tries);

  }

}
